package com.cognizant.ems.model;
import com.cognizant.ems.exceptions.AgeNotReachedExceptions;
import com.cognizant.ems.exceptions.InvalidCountryExceptions;
public class EmployeeAge{
	public void ageCheck()
	{
		int age=8;
		if(age>=18){	
			System.out.println("PERSON CAN VOTE");
		}
		else
		{
			throw new AgeNotReachedExceptions("PERSON CANNOT VOTE");
		}
	}
	public void countryCheck() throws InvalidCountryExceptions
	{
		String country="SRI LANKA";
		if(country.equals("INDIA")){
			System.out.println("COUNTRY IS INDIA");
		}
		else{
			throw new InvalidCountryExceptions("COUNTRY IS NOT INDIA");
		}
	}
}