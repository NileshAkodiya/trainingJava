package com.yash.storemanagementsystem.daoimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.ProductQuality;
/*
 * unit tests for ProductQualityDAOImpl are there in this class for each method.
 */
public class ProductQualityDAOImplTest {
	private ProductQualityDAOImpl productQualityDAOImpl;
	private ProductQuality productQuality;
	
	@Before
	public void setUp() {
		productQualityDAOImpl=new ProductQualityDAOImpl();
	}

	/*
	 * test for save method with corect product quality object
	 */
	@Test
	public void test_save_GivenProductQualityObject_ShouldReturnProductQualityObject() throws NoProductNameGivenException, NoProductDescriptionGivenException {
		productQuality=new ProductQuality();
		productQuality.setId(0);
		productQuality.setName("abcd");
		productQuality.setDescription("efghij");
		ProductQuality productQualityTest=new ProductQuality();
		productQualityTest=productQualityDAOImpl.save(productQuality);
		assertNotNull(productQualityTest);
	}

	/*
	 * test for updateProductQualityName() method.
	 */
	@Test
	public void test_UpdateProductQualityName_GivenProductQualityObject_ShouldReturnProductQualityObject() {
		productQuality=new ProductQuality();
		productQuality.setId(28);
		productQuality.setName("ScreenType");
		ProductQuality productQualityTest=new ProductQuality();
		productQualityTest=productQualityDAOImpl.updateProductQualityName(productQuality);
		assertNotNull(productQualityTest);
	}

	/*
	 * test for updateProductQualityDescrition() method.
	 */
	@Test
	public void test_UpdateProductQualityDescription_GivenProductQualityObject_ShouldReturnProductQualityObject() {
		productQuality=new ProductQuality();
		productQuality.setId(28);
		productQuality.setDescription("updated desc");
		ProductQuality productQualityTest=new ProductQuality();
		productQualityTest=productQualityDAOImpl.updateProductQualityDescription(productQuality);
		assertNotNull(productQualityTest);
	}

	/*
	 * test for deleteProductQualityById() method.
	 */
	@Test
	public void test_deleteProductQualityById_GivenProductQualityIdAsnumber_ShouldReturnProductQualityObject() {
		int id=29;
		ProductQuality productQualityTest=new ProductQuality();
		productQualityTest=productQualityDAOImpl.deleteProductQualityById(id);
		assertNotNull(productQualityTest);
	}

	/*
	 * test for deleteProductQualityByName() method.
	 */
	@Test
	public void test_deleteProductQualityByName_GivenProductQualityNameAsString_ShouldReturnProductQualityObject() {
		String name="battery backup";
		ProductQuality productQualityTest=new ProductQuality();
		productQualityTest=productQualityDAOImpl.deleteProductQualityByName(name);
		assertNotNull(productQualityTest);
	}

}
