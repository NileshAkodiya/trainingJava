package com.yash.storemanagementsystem.daoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
/*
 * unit tests for ProductDAOImpl are there in this class for each method.
 */
public class ProductDAOImplTest {

	private ProductDAOImpl productDAOImpl;
	Product product;

	@Before
	public void setUp() {
		productDAOImpl=new ProductDAOImpl();
	}
	/*
	 * test for save method with null product object
	 */
	@Test
	public void test_Save_GivenNullProductRef_ShouldReturnNull() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		product=null;
		Product productTest=productDAOImpl.save(product);
		assertNull(productTest);
	}

	/*
	 * test for save method with correct product object.
	 */
	@Test
	public void test_save_GivenProductObject_ShouldReturnProductObject() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		product =new Product();
		product.setId(1);
		product.setProductCustomerId(100);
		product.setName("mobile");
		product.setPrice(12000);
		product.setDescription("This is my first product which is a mobile.");
		Product productTest=productDAOImpl.save(product);
		assertNotNull(productTest);
	}
	/*
	 *test for save method with product object having no name
	 */
	@Test(expected=NoProductNameGivenException.class)
	public void test_save_GivenProductObjectNameIsEmpty_ShouldThrowNoProductNameGivenException1() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		product =new Product();
		product.setId(1);
		product.setProductCustomerId(100);
		product.setName("");
		product.setPrice(12000);
		product.setDescription("This is my first product which is a mobile.");
		productDAOImpl.save(product);
	}

	/*
	 *test for save method with product object having no description
	 */
	@Test(expected=NoProductDescriptionGivenException.class)
	public void test_save_GivenProductObjectDescriptionIsEmpty_ShouldThrowNoProductDescriptionGivenException() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {	
		product =new Product();
		product.setId(1);
		product.setProductCustomerId(100);
		product.setName("mobile");
		product.setPrice(12000);
		product.setDescription("");
		productDAOImpl.save(product);
	}
	

	/*
	 *test for save method with product object having no price
	 */
	@Test(expected=NoPriceGivenException.class)
	public void test_save_GivenProductObjectPriceIsZero_ShouldThrowNoPriceGivenException() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		product =new Product();
		product.setId(1);
		product.setProductCustomerId(100);
		product.setName("mobile");
		product.setPrice(0);
		product.setDescription("This is my first product which is a mobile.");
		productDAOImpl.save(product);
	}


	/*
	 *test for findAll() method 
	 */
	@Test
	public void test_FindAll_ShouldReturnListOfProjectObjects()  {
		List<Product> product=productDAOImpl.findAll();
		assertNotNull(product);
	}

	/*
	 * test for findById() method.
	 */
	@Test
	public void test_FindById_GivenIdAsNumber_ShouldReturnListOfProjectObject()  {
		int id=83;
		List<Product> product=productDAOImpl.findById(id);
		assertNotNull(product);
	}

	/*
	 * test for updatePrice() method.
	 */
	@Test
	public void test_UpdateProductPrice_GivenIdAsNumberAndPriceAsnumber_ShouldReturnProjectObjects() throws NoPriceGivenException  {
		int id=91;
		double price=25000;
		Product product=new Product();
		product=productDAOImpl.updateProductPrice(id, price);
		assertNotNull(product);
	}


	/*
	 * test for updateDescription() method.
	 */
	@Test
	public void test_UpdateProductDescription_GivenIdAsNumberAndDescriptionAsString_ShouldReturnProjectObjects() throws NoPriceGivenException  {
		int id=91;
		String desc="New description";
		Product product=new Product();
		product=productDAOImpl.updateProductDescription(id, desc);
		assertNotNull(product);
	}

	/*
	 * test for deleteProductById() method.
	 */
	@Test
	public void test_DeleteProductById_GivenIdAsNumber_ShouldReturnProjectObjects() throws NoPriceGivenException  {
		int id=92;
		Product product=new Product();
		product=productDAOImpl.deleteProductById(id);
		assertNotNull(product);
	}

	/*
	 * test for deleteProduct() method.
	 */
	/*@Test
	public void test_DeleteAllProducts_ShouldReturnString() throws NoPriceGivenException  {
		String message=productDAOImpl.deleteProduct();
		assertEquals("All products have been deleted.",message);
	}*/

}
