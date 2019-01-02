package com.cognizant.ems.exceptions;

public class InvalidCountryExceptions extends Exception{

	public InvalidCountryExceptions(String country)
	{
		super(country);
	}
}