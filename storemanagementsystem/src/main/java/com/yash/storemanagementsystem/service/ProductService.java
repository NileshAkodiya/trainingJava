package com.yash.storemanagementsystem.service;
import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
import java.util.List;
/*
 * this layer is working as bridge between presentation layer(MenuUtil) and domain layer(ProductDAO)
 * it declares all methods for all services according to our business need that a user can get for 
 * product module, their return type and argument details.
 */
public interface ProductService {
	/*
	 * This method addProduct() calls the method presents in ProductDAO to add a product in database 
	 * and return the same.
	 */
	public Product addProduct(Product product) throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException;
	/*
	 * This method getAllProducts() calls the method presents in ProductDAO to get a list of all products 
	 * available in database.
	 */ 
	public List<Product> getAllProducts();
	
	/*
	 * This method getProductById() calls the method presents in ProductDAO to get a product by
	 * its ID from database.
	 */ 
	
	public List<Product> getProductById(int id);
	

	/*
	 * This method updateProductPrice() calls the method presents in ProductDAO to update a product's 
	 * price by taking id and new price.
	 */ 
	public Product  updateProductPrice	(int id, int price) throws NoPriceGivenException;
	

	/*
	 * This method updateProductDescription() calls the method presents in ProductDAO to update a product's 
	 * description by taking id and new description.
	 */ 
	public Product  updateProductDescription(int id,String description);
	

	/*
	 * This method deleteProduct() calls the method presents in ProductDAO to delete all products 
	 * from database.
	 */ 
	public String deleteProduct();
	

	/*
	 * This method deleteProductById() calls the method presents in ProductDAO to delete a products 
	 * from database byt its ID.
	 */ 
	public Product deleteProductById(int id);

}
