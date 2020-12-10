package com.yash.storemanagementsystem.dao;

import java.util.List;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
/*
 *this is the main domain layer where the business logic has been written
 *for all services CRUD operations all declared in this interface ProductDAO
 */

public interface ProductDAO {
	
	/*
	 * this save() method is used for inserting product into table products
	 */
	public Product save(Product product) throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException;
	/*
	 * this findAll() method is used for fetching products from table products
	 */

	public List<Product> findAll();
	
	/*
	 * this findById() method is used for fetching a product by ID from table products
	 */
	public List<Product> findById(int id);
	
	/*
	 * this updateProductPrice() method is used for updating product's price into table products
	 */
	public Product updateProductPrice(int id,int price) throws NoPriceGivenException;


	/*
	 * this updateProductDescription() method is used for updating product's description into table products
	 */
	public Product updateProductDescription(int id,String description);

	/*
	 * this deleteProduct() method is used for deleting all products from table products
	 */
	public String deleteProduct();


	/*
	 * this deleteProductById() method is used for deleting a product from table products
	 */
	public Product deleteProductById(int id);


}
