package com.yash.storemanagementsystem.helper;

import java.util.Scanner;

import com.yash.storemanagementsystem.model.ProductQuality;
import com.yash.storemanagementsystem.serviceimpl.ProductQualityServiceImpl;
/*
 * Here in this class we ask user to enter the required data in order to fulfill his/her 
 * service need for product Quality.
 * and call the service method by passing this data to service class.
 */
public class ProductQualityHelper {
	ProductQualityServiceImpl productQualityServiceImpl=new ProductQualityServiceImpl();
	ProductQuality productQuality=new ProductQuality();
	Scanner sc=new Scanner(System.in);

	/*
	 *  this method case1()is here to get service of adding product quality in db.
	 */
	public void case1() {
		System.out.print("enter the quality's name");
		String name=sc.nextLine();
		System.out.print("enter the quality's description");
		String description=sc.nextLine();
		productQuality.setName(name);
		productQuality.setDescription(description);
		productQuality=productQualityServiceImpl.addProductQuality(productQuality);
		System.out.println(productQuality);
	}
	/*
	 *  this method case2()is here to get service of updating product qualities name in db.
	 */
	public void case2() {
		System.out.println("enter product quality Id and new name");
		int id=sc.nextInt();
		productQuality.setId(id);
		sc.nextLine();
		String name=sc.nextLine();
		productQuality.setId(id);
		productQuality.setName(name);
		productQuality=productQualityServiceImpl.updateProductQualityName(productQuality);
		System.out.println(productQuality);
	}
	/*
	 *  this method case3()is here to get service of updating product qualities description in db.
	 */
	public void case3() {
		System.out.println("enter product quality Id and new description");
		int id=sc.nextInt();
		productQuality.setId(id);
		sc.nextLine();
		String description=sc.nextLine();
		productQuality.setDescription(description);
		productQuality=productQualityServiceImpl.updateProductQualityDescription(productQuality);
		System.out.println(productQuality);
	}
	/*
	 *  this method case4()is here to get service of deleting all product qualities from db.
	 */
	public void case4() {
		productQualityServiceImpl.deleteProductQuality();
	}
	/*
	 *  this method case6()is here to get service of deleting  a product quality by its Id from db.
	 */
	public void case5() {
		System.out.println("enter product quality Id");
		int id=sc.nextInt();
		productQuality.setId(id);
		productQuality=productQualityServiceImpl.deleteProductQualityById(id);
		System.out.println(productQuality);
	}
	/*
	 *  this method case6()is here to get service of deleting  a product quality by its name from db.
	 */
	public void case6() {
		System.out.println("enter product quality name");
		String name=sc.nextLine();
		productQuality.setName(name);
		productQuality=productQualityServiceImpl.deleteProductQualityByName(name);
		System.out.println(productQuality);
	}

}
