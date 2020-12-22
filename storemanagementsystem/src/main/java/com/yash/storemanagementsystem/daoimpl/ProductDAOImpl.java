package com.yash.storemanagementsystem.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.storemanagementsystem.util.JDBCUtil;
import com.yash.storemanagementsystem.dao.ProductDAO;
import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
/*
 * It is the only implementation of ProductDAO interface.
 */
public class ProductDAOImpl implements ProductDAO{
	JDBCUtil jdbcUtil=new JDBCUtil();

	/*
	 * it is the implementation of method save() of  ProductDAO interface
	 */
	@Override
	public Product save(Product product) throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		Product productTemp=new Product();
		if(product==null) {
			return null;
		}else {
			if(product.getName().equals("")) {
				throw new NoProductNameGivenException("Enter the product name.");
			}
			if(product.getDescription().equals("")) {
				throw new NoProductDescriptionGivenException("Enter the product descprition");
			}if(product.getPrice()<=0) {
				throw new NoPriceGivenException("Enter the Correct product Price");
			}
			try {
				String query="insert into products (productCustomerId,name,price,description) values(?,?,?,?)";
				PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
				preparedStatement.setInt(1, product.getProductCustomerId());
				preparedStatement.setString(2, product.getName());
				preparedStatement.setDouble(3, product.getPrice());
				preparedStatement.setString(4, product.getDescription());
				int i=preparedStatement.executeUpdate();
				if(i!=0) {
					query="select * from products ORDER BY id DESC LIMIT 1";
					preparedStatement=jdbcUtil.getPrepareStatement(query);
					ResultSet rs=preparedStatement.executeQuery();  

					while(rs.next()){  
						productTemp.setId(rs.getInt(1));
						productTemp.setProductCustomerId(rs.getInt(2));
						productTemp.setName(rs.getString(3));
						productTemp.setPrice(rs.getDouble(4));
						productTemp.setDescription(rs.getString(5));
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return productTemp;
	}

	/*
	 * it is the implementation of method findAll() of  ProductDAO interface
	 */
	@Override
	public List<Product> findAll() {
		List<Product> list=new ArrayList<Product>();
		try {
			String query="select * from products";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			ResultSet rs=preparedStatement.executeQuery();  
			if(rs.next()==false)
				System.out.println("NO products to show.");
			rs.beforeFirst();
			while(rs.next()){  
				Product productTemp=new Product();
				productTemp.setId(rs.getInt(1));
				productTemp.setProductCustomerId(rs.getInt(2));
				productTemp.setName(rs.getString(3));
				productTemp.setPrice(rs.getDouble(4));
				productTemp.setDescription(rs.getString(5));
				list.add(productTemp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;

	}

	/*
	 * it is the implementation of method findById() of  ProductDAO interface
	 */
	@Override
	public List<Product> findById(int id) {

		List<Product> list=new ArrayList<Product>();
		try {
			String query="select * from products where id=(?)";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();  
			if(rs.next()==false)
				System.out.println("No product found with entered id");
			rs.beforeFirst();

			while(rs.next()){  
				Product productTemp=new Product();
				productTemp.setId(rs.getInt(1));
				productTemp.setProductCustomerId(rs.getInt(2));
				productTemp.setName(rs.getString(3));
				productTemp.setPrice(rs.getDouble(4));
				productTemp.setDescription(rs.getString(5));
				list.add(productTemp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}


	/*
	 * it is the implementation of method updateProductPrice() of  ProductDAO interface
	 */
	@Override
	public Product updateProductPrice(int id, double price) throws NoPriceGivenException {


		Product product=new Product();
		if(price<=0) {
			throw new NoPriceGivenException("Enter the Correct product Price");
		}
		try {
			String query="update products set price=? where id=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, id);
			int i=preparedStatement.executeUpdate();
			if(i!=0) {

				query="select * from products where id=(?)";
				preparedStatement=jdbcUtil.getPrepareStatement(query);
				preparedStatement.setInt(1, id);
				ResultSet rs=preparedStatement.executeQuery();  

				while(rs.next()){  
					product.setId(rs.getInt(1));
					product.setProductCustomerId(rs.getInt(2));
					product.setName(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					product.setDescription(rs.getString(5));

				}


				return product ;
			}else
				System.out.println("No product was found with entered id.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}


	/*
	 * it is the implementation of method updateProductDescription() of  ProductDAO interface
	 */
	@Override
	public Product updateProductDescription(int id,String description) {


		Product product=new Product();
		try {
			String query="update products set description=(?) where id=(?)";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1,description );
			preparedStatement.setInt(2, id);
			int i=preparedStatement.executeUpdate();
			if(i!=0) {

				query="select * from products where id=(?)";
				preparedStatement=jdbcUtil.getPrepareStatement(query);
				preparedStatement.setInt(1, id);
				ResultSet rs=preparedStatement.executeQuery();  

				while(rs.next()){  
					product.setId(rs.getInt(1));
					product.setProductCustomerId(rs.getInt(2));
					product.setName(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					product.setDescription(rs.getString(5));

				}


				return product ;
			}else
				System.out.println("No product was found with entered id.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}


	/*
	 * it is the implementation of method deleteProduct() of  ProductDAO interface
	 */
	@Override
	public String deleteProduct() {
		String query="delete from products ";
		PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
		try {
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				return "All products have been deleted.";
			}else {
				return "No product was found to delete.";

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	/*
	 * it is the implementation of method deleteProductById() of  ProductDAO interface
	 */
	@Override
	public Product deleteProductById(int id) {
		Product product=new Product();
		try {
			String query="select * from products where id=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery(); 
			if(rs.next()==false)
				System.out.println("No product found with entered id");
			rs.beforeFirst();

			while(rs.next()){  
				product.setId(rs.getInt(1));
				product.setProductCustomerId(rs.getInt(2));
				product.setName(rs.getString(3));
				product.setPrice(rs.getDouble(4));
				product.setDescription(rs.getString(5));
			}
			query="delete from products where id=?";
			preparedStatement=jdbcUtil.getPrepareStatement(query);

			preparedStatement.setInt(1, id);
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				return product;
			}else {
				System.out.println("No product has been deleted.");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
