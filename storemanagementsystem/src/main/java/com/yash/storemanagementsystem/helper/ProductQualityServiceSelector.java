package com.yash.storemanagementsystem.helper;

import java.util.Scanner;
/**
 * Here we ask to user what service he/she is interested to get and call the method in helper class accordingly.
 */
public class ProductQualityServiceSelector {
	ProductQualityHelper productQualityHelper=new ProductQualityHelper();
	public void selector() {

		System.out.println("On which service Do u want to work on? enter\n1 to add productQuality\n2 to update name of productQuality\n3 to update description of productQuality\n4 to delete all productQualities\n5 to delete a specific product Quality by Id.\n6  to delete a specific product Quality by name.");
		Scanner sc=new Scanner(System.in);
		try {
		int serviceNo=sc.nextInt();
		switch(serviceNo) {
		case 1:
			productQualityHelper.case1();
			break;
		case 2:
			productQualityHelper.case2();
			break;
		case 3:
			productQualityHelper.case3();
			break;
		case 4:
			productQualityHelper.case4();
			break;
		case 5:
			productQualityHelper.case5();
			break;
		case 6:
			productQualityHelper.case6();
			break;
				
		default:
			System.out.println("Enter correct service no.");
			selector();
		}
		}catch(Exception e) {
			System.out.println("Invalid Input.");
		}
	}
}
