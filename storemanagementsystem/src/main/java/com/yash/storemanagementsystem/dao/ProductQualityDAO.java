package com.yash.storemanagementsystem.dao;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.ProductQuality;
/*
 *this is the main domain layer where the business logic has been written
 *for all services CRUD operations all declared in this interface ProductQualityDAO
 */
public interface ProductQualityDAO {

	/*
	 * this save method is used for inserting product quality into table product_qualities
	 */
	public ProductQuality save(ProductQuality productQuality) throws NoProductNameGivenException, NoProductDescriptionGivenException;
	

	/*
	 * this updateProductQualityName() method is used for updating product quality Name into table product_qualities
	 */
	public ProductQuality updateProductQualityName(ProductQuality productQuality);
	

	/*
	 * this updateProductQualityDescription() method is used for updating product quality  Description into table product_qualities
	 */
	public ProductQuality updateProductQualityDescription(ProductQuality productQuality);
	

	/*
	 * this deleteProductQuality() method is used for deleting all product qualities from table product_qualities
	 */
	public void deleteProductQuality();
	

	/*
	 * this deleteProductQualityById() method is used for deleting a product quality by its id from table product_qualities
	 */
	public ProductQuality deleteProductQualityById(int id);
	

	/*
	 * this deleteProductQualityByName() method is used for deleting a product quality by its name from table product_qualities
	 */
	public ProductQuality deleteProductQualityByName(String name);
	
}
