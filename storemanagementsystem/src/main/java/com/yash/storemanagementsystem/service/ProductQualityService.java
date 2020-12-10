package com.yash.storemanagementsystem.service;

import com.yash.storemanagementsystem.model.ProductQuality;
/*
 * this layer is working as bridge between presentation layer(MenuUtil) and domain layer(ProductQualityDAO)
 * it declares all methods for all services according to our business need that a user can get for 
 * product quality module, their return type and argument details.
 */
public interface ProductQualityService {
	/*
	 * This method addProductQuality() calls the method presents in ProductQualityDAO to add a product
	 * quality in database and return the same.
	 */
	public ProductQuality addProductQuality(ProductQuality productQuality);
	
	/*
	 * This method updateProductQualityName() calls the method presents in ProductQualityDAO to update a  
	 *  product quality name.
	 */
	public ProductQuality updateProductQualityName(ProductQuality productQuality);
	

	/*
	 * This method updateProductQualityDescription() calls the method presents in ProductQualityDAO to update a  
	 *  product quality description.
	 */
	public ProductQuality updateProductQualityDescription(ProductQuality productQuality);
	

	/*
	 * This method deleteProductQuality() calls the method presents in ProductQualityDAO to delete all  
	 *  product qualities from db.
	 */
	
	public void deleteProductQuality();
	
	/*
	 * This method deleteProductQualityById() calls the method presents in ProductQualityDAO to delete a  
	 *  product quality from db by its id.
	 */
	public ProductQuality deleteProductQualityById(int id);
	

	/*
	 * This method deleteProductQualityByName() calls the method presents in ProductQualityDAO to delete a  
	 *  product quality from db by its Name.
	 */
	public ProductQuality deleteProductQualityByName(String name);

}
