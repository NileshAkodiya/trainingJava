package com.yash.storemanagementsystem.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.helper.ProductQualityServiceSelector;
import com.yash.storemanagementsystem.helper.ProductServiceSelector;
/**
 * 
 * In this Menu class we ask user that in which module he/she is interested and invoke
 * 
 * the ServiceSelector class's selector method according to user's choice.
 * 
 *
 */
public class MenuUtil {
	Scanner sc=new Scanner(System.in);
	public void start() throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException {
		System.out.println("In which module Do u want to work on? enter\n1 for product\n2 for Product Quality");
		try {
			int module=sc.nextInt();

			if(module==1) {
				new ProductServiceSelector().selector();
			}
			else if(module==2) {
				new ProductQualityServiceSelector().selector();

			}
			else {
				System.out.println("No module available for given number!!!");
				System.out.println("Do u want to continue? enter\n 1 for yes \n2 for no.");
				if(sc.nextInt()==1) {
					start();
				}
				else {
					System.out.println("Thanks for using.");
					System.exit(0);
				}
			}
			
				System.out.println("Do u want to continue? enter\n 1 for yes \n2 for no.");
				if(sc.nextInt()==1)
					start();
				else {
					System.out.println("Thanks for using.");
				}
		}catch(InputMismatchException e) {
			System.out.println("Entered Invalid Input!!!");
		}
	}

}
