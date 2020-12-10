package com.yash.storemanagementsystem;

import com.yash.storemanagementsystem.exception.NoPriceGivenException;
import com.yash.storemanagementsystem.exception.NoProductDescriptionGivenException;
import com.yash.storemanagementsystem.exception.NoProductNameGivenException;
import com.yash.storemanagementsystem.util.MenuUtil;

/**
 * This is the entry point of the store-management-software.
 * it contains main method,
 * here we are invoking the start method.
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoProductNameGivenException, NoProductDescriptionGivenException, NoPriceGivenException
    {
    	MenuUtil menuUtil=new MenuUtil();
    	menuUtil.start();
    }
}
