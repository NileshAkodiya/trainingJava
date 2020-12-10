package com.yash.storemanagementsystem.serviceimpl;

import com.yash.storemanagementsystem.dao.ProductQualityDAO;
import com.yash.storemanagementsystem.daoimpl.ProductQualityDAOImpl;
import com.yash.storemanagementsystem.model.ProductQuality;
import com.yash.storemanagementsystem.service.ProductQualityService;
/*
 * It is the only implementation of ProductQualityService interface.
 */
public class ProductQualityServiceImpl implements ProductQualityService{
	ProductQualityDAO productQualityDAO;
	public ProductQualityServiceImpl() {
		productQualityDAO=new ProductQualityDAOImpl();
	}


	/*
	 * it is the implementation of method addProductQuality() of  ProductQualityService interface
	 */
	@Override
	public ProductQuality addProductQuality(ProductQuality productQuality) {
		return productQualityDAO.save(productQuality);
	}


	/*
	 * it is the implementation of method updateProductQualityName() of  ProductQualityService interface
	 */
	@Override
	public ProductQuality updateProductQualityName(ProductQuality productQuality) {
		return productQualityDAO.updateProductQualityName(productQuality);
	}


	/*
	 * it is the implementation of method updateProductQualityDescription() of  ProductQualityService interface
	 */
	@Override
	public ProductQuality updateProductQualityDescription(ProductQuality productQuality) {
		return productQualityDAO.updateProductQualityDescription(productQuality);
	}


	/*
	 * it is the implementation of method deleteProductQuality() of  ProductQualityService interface
	 */
	@Override
	public void deleteProductQuality() {
		productQualityDAO.deleteProductQuality();
		
	}


	/*
	 * it is the implementation of method deleteProductQualityById() of  ProductQualityService interface
	 */
	@Override
	public ProductQuality deleteProductQualityById(int id) {
		return productQualityDAO.deleteProductQualityById(id);
	}


	/*
	 * it is the implementation of method deleteProductQualityByName() of  ProductQualityService interface
	 */
	@Override
	public ProductQuality deleteProductQualityByName(String name) {
		return productQualityDAO.deleteProductQualityByName(name);
	}

}
