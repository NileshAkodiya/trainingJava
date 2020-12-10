package com.yash.storemanagementsystem.helper;

import java.util.Scanner;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
/**
 * Here we ask to user what service he/she is interested to get and call the method in helper class accordingly.
 */
public class ProductServiceSelector {

	ProductHelper productHelper=new ProductHelper();
	public void selector() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		System.out.println("On which service Do u want to work on? enter\n1 to add product\n2 to see all Products\n 3 to see a perticular product with id.\n4 to update price of product\n5 to update description of product\n6 to delete all products\n7 to delete a specific product.");
		Scanner sc=new Scanner(System.in);
		int serviceNo=sc.nextInt();
	
		switch(serviceNo) {
		case 1:
			productHelper.case1();
			break;
		case 2:
			productHelper.case2();
			break;
		case 3:
			productHelper.case3();
			break;
		case 4:
			productHelper.case4();
			break;
		case 5:
			productHelper.case5();
			break;
		case 6:
			productHelper.case6();
			break;
		case 7:
			productHelper.case7();
			break;
				
		default:
			System.out.println("Enter correct service no.");
			selector();
		}
		
	}
}
