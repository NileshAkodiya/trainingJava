package com.yash.storemanagementsystem.exception;
/*
 * this is my customized exception for no price given situation.
 */
public class NoPriceGivenException extends Exception {
	public NoPriceGivenException() {
	}
	public NoPriceGivenException(String message) {
		super(message);
	}

}
