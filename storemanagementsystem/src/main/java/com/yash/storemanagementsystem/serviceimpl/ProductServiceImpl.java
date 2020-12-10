package com.yash.storemanagementsystem.serviceimpl;

import java.util.List;

import com.yash.storemanagementsystem.dao.ProductDAO;
import com.yash.storemanagementsystem.daoimpl.ProductDAOImpl;
import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
import com.yash.storemanagementsystem.service.ProductService;
/*
 * It is the only implementation of ProductService interface.
 */
public class ProductServiceImpl implements ProductService{
	private ProductDAO productDAO;
	public ProductServiceImpl() {
		productDAO=new ProductDAOImpl();
	}
	/*
	 * it is the implementation of method addProduct() of  ProductService interface
	 */
	@Override
	public Product addProduct(Product product) throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		
		return productDAO.save(product);
	}


	/*
	 * it is the implementation of method getAllProducts() of  ProductService interface
	 */
	@Override
	public List<Product> getAllProducts() {
		return productDAO.findAll();
	}


	/*
	 * it is the implementation of method getProductById() of  ProductService interface
	 */
	@Override
	public List<Product> getProductById(int id) {
		return productDAO.findById(id);
	}


	/*
	 * it is the implementation of method updateProductPrice() of  ProductService interface
	 */
	@Override
	public Product updateProductPrice(int id, int price) throws NoPriceGivenException {
		return productDAO.updateProductPrice(id,price);
	}


	/*
	 * it is the implementation of method updateProductDescription() of  ProductService interface
	 */
	@Override
	public Product updateProductDescription(int id,String description) {
		return productDAO.updateProductDescription(id,description);
	}


	/*
	 * it is the implementation of method deleteProduct() of  ProductService interface
	 */
	@Override
	public String deleteProduct() {
		return productDAO.deleteProduct();
	}


	/*
	 * it is the implementation of method deleteProductById() of  ProductService interface
	 */
	@Override
	public Product deleteProductById(int id) {
		
		return productDAO.deleteProductById(id);
	}

}
