package com.yash.storemanagementsystem.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.model.Product;
import com.yash.storemanagementsystem.serviceimpl.ProductServiceImpl;
/*
 * Here in this class we ask user to enter the required data in order to fulfill his/her 
 * service need for product.
 * and call the service method by passing this data to service class.
 */

public class ProductHelper {
	Scanner sc=new Scanner(System.in);
	ProductServiceImpl productServiceImpl=new ProductServiceImpl();
	Product product=new Product();
	List<Product> list =new ArrayList<Product>();
	/*
	 *  this method case1()is here to get service of adding product in db.
	 */
	public void case1() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		System.out.println("enter the productCustomerId");
		int id=sc.nextInt();
		product.setProductCustomerId(id);
		System.out.println("enter the name");
		String name=sc.next();
		product.setName(name);
		sc.nextLine();
		System.out.println("enter the price");
		int price=sc.nextInt();
		product.setPrice(price);
		System.out.println("enter the description");
		sc.nextLine();
		String description=sc.nextLine();
		product.setDescription(description);
		product=productServiceImpl.addProduct(product);
		System.out.println(product);

	}
	/*
	 *  this method case2()is here to get service of seeing all products available in db.
	 */
	public void case2() {
		list = productServiceImpl.getAllProducts();
		for(Product productTemp:list) {
			System.out.println(productTemp);
		}
	}
	/*
	 *  this method case3()is here to get service of seeing a product by its Id from db.
	 */
	public void case3() {
		System.out.println("Enter the id of product u want to see");
		list = productServiceImpl.getProductById(sc.nextInt());
		for(Product productTemp:list) {
			System.out.println(productTemp);
		}

	}
	/*
	 *  this method case4()is here to get service of updating product's price in db.
	 */
	public void case4() throws NoPriceGivenException {
		System.out.println("Enter the id and new price");
		product=productServiceImpl.updateProductPrice(sc.nextInt(), sc.nextInt());
		System.out.println(product);
	}
	/*
	 *  this method case5()is here to get service of updating product's description in db.
	 */
	public void case5() {
		System.out.println("Enter the id and new description");
		int id=sc.nextInt();
		sc.nextLine();
		String desc=sc.nextLine();
		product=productServiceImpl.updateProductDescription(id,desc);
		System.out.println(product);

	}
	/*
	 *  this method case6()is here to get service of deleting all products from db.
	 */
	public void case6() {
		System.out.println(productServiceImpl.deleteProduct());
	}

	/*
	 *  this method case7()is here to get service of deleting a product by its Id from db.
	 */
	public void case7() {
		System.out.println("Enter the id to delete the project");
		int id=sc.nextInt();
		product=productServiceImpl.deleteProductById(id);
		System.out.println(product);
		
	}

}
