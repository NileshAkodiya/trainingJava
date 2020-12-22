package com.yash.storemanagementsystem.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.storemanagementsystem.dao.ProductQualityDAO;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
import com.yash.storemanagementsystem.model.ProductQuality;
import com.yash.storemanagementsystem.util.JDBCUtil;
/*
 * It is the only implementation of ProductQualityDAO interface.
 */
public class ProductQualityDAOImpl implements ProductQualityDAO{
	JDBCUtil jdbcUtil=new JDBCUtil();

	/*
	 * it is the implementation of method save() of  ProductQualityDAO interface
	 */

	@Override
	public ProductQuality save(ProductQuality productQuality) throws NoProductNameGivenException, NoProductDescriptionGivenException {
		if(productQuality.getName().equals(""))
			throw new NoProductNameGivenException("Enter the product quality name.");
		if(productQuality.getDescription().equals(""))
			throw new NoProductDescriptionGivenException("Enter the product quality description.");
		try {
			String query="insert into product_qualities (name,description) values(?,?)";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1, productQuality.getName());
			preparedStatement.setString(2, productQuality.getDescription());
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				query="select * from product_qualities ORDER BY id DESC LIMIT 1";
				preparedStatement=jdbcUtil.getPrepareStatement(query);
				ResultSet rs=preparedStatement.executeQuery();  

				while(rs.next()){  
					ProductQuality productQualityTemp=new ProductQuality();
					productQualityTemp.setId(rs.getInt(1));
					productQualityTemp.setName(rs.getString(2));
					productQualityTemp.setDescription(rs.getString(3));
					return productQualityTemp;
				}

				return productQuality;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	/*
	 * it is the implementation of method updateProductQualityName() of  ProductQualityDAO interface
	 */
	@Override
	public ProductQuality updateProductQualityName(ProductQuality productQuality) {

		try {
			String query="update product_qualities set name=? where id=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1, productQuality.getName());
			preparedStatement.setInt(2, productQuality.getId());
			int i=preparedStatement.executeUpdate();
			if(i!=0) {

				query="select * from product_qualities where id=(?)";
				preparedStatement=jdbcUtil.getPrepareStatement(query);
				preparedStatement.setInt(1, productQuality.getId());
				ResultSet rs=preparedStatement.executeQuery();  

				while(rs.next()){  
					productQuality.setId(rs.getInt(1));
					productQuality.setName(rs.getString(2));
					productQuality.setDescription(rs.getString(3));

				}


				return productQuality ;
			}else {
				System.out.println("No product quality was found with entered id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	/*
	 * it is the implementation of method updateProductQualityDescription() of  ProductQualityDAO interface
	 */
	@Override
	public ProductQuality updateProductQualityDescription(ProductQuality productQuality) {

		try {
			String query="update product_qualities set description=? where id=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1, productQuality.getDescription());
			preparedStatement.setInt(2, productQuality.getId());
			int i=preparedStatement.executeUpdate();
			if(i!=0) {

				query="select * from product_qualities where id=(?)";
				preparedStatement=jdbcUtil.getPrepareStatement(query);
				preparedStatement.setInt(1, productQuality.getId());
				ResultSet rs=preparedStatement.executeQuery();  
				while(rs.next()){  
					productQuality.setId(rs.getInt(1));
					productQuality.setName(rs.getString(2));
					productQuality.setDescription(rs.getString(3));
				}
				return productQuality ;
			}else {
				System.out.println("No product quality was found with entered id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;

	}

	/*
	 * it is the implementation of method deleteProductQuality() of  ProductQualityDAO interface
	 */
	@Override
	public void deleteProductQuality() {

		String query="delete from product_qualities ";
		PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
		try {
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				System.out.println("All product qualities have been deleted.");
			}else {
				System.out.println("No product quality was found to delete");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * it is the implementation of method deleteProductQualityById() of  ProductQualityDAO interface
	 */
	@Override
	public ProductQuality deleteProductQualityById(int id) {
		ProductQuality productQuality=new ProductQuality();
		try {
			String query="select * from product_qualities where id=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();  

			while(rs.next()){  
				productQuality.setId(rs.getInt(1));
				productQuality.setName(rs.getString(2));
				productQuality.setDescription(rs.getString(3));
			}


			query="delete from product_qualities where id=?";
			preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setInt(1, id);
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				return productQuality;
			}else {
				System.out.println("No product quality was found with entered id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

	/*
	 * it is the implementation of method deleteProductQualityByName() of  ProductQualityDAO interface
	 */
	@Override
	public ProductQuality deleteProductQualityByName(String name) {

		ProductQuality productQuality=new ProductQuality();
		try {

			String query="select * from product_qualities where name=?";
			PreparedStatement preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1, name);
			ResultSet rs=preparedStatement.executeQuery();  
			while(rs.next()){  
				productQuality.setId(rs.getInt(1));
				productQuality.setName(rs.getString(2));
				productQuality.setDescription(rs.getString(3));
			}


			query="delete from product_qualities where name=?";
			preparedStatement=jdbcUtil.getPrepareStatement(query);
			preparedStatement.setString(1, name);
			int i=preparedStatement.executeUpdate();
			if(i!=0) {
				return productQuality;
			}else {
				System.out.println("No product quality was found with entered name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


		return null;
	}

}
