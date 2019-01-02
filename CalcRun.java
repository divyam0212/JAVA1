package com.cts.run;
import com.cognizant.ems.model.EmployeeAge;
import com.cts.calculator.Calculator;
import com.cognizant.ems.exceptions.AgeNotReachedExceptions;
import com.cognizant.ems.exceptions.InvalidCountryExceptions;
public class CalcRun
{
	public static void main(String args[])/* throws NullPointerException*/
	{
		
		/*EmployeeAge e=new EmployeeAge();
		try{
			e.ageCheck();
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}*/
		
		EmployeeAge countryEmployee=new EmployeeAge();
		try{
			countryEmployee.countryCheck();
		}
		catch(InvalidCountryExceptions ice){
			System.out.println(ice.getMessage());
			ice.printStackTrace();
		}
		

		/*
	 	int result1=0;
		Calculator cal1=null;
		try
		{
			int result1=calc.addition(10,0);
			System.out.println(result1);
			System.out.println("DIVISION");
		
			result1=cal1.division(10,20);
			System.out.println(result1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("DIVISION BY ZERO NOT POSSIBLE..."+e);
		}
		catch(NullPointerException ae)
		{
			System.out.println("NULL POINTER EXCEPTION NOT POSSIBLE..."+ae);
		}
		System.out.println("END OF MAIN");
		
		if(cal1==null)
		{
			cal1=new Calculator();
			result1=cal1.addition(10,20);
			System.out.println(result1);

			try{
				result1=cal1.division(20,0);
			}
			catch(ArithmeticException ae){
				System.out.println("toString:"+ae);
				System.out.println("getMessage:"+ae.getMessage());
				System.out.println("printStackTrace:");
				ae.printStackTrace();
				result1=cal1.division(20,1);
				System.out.println(result1);
			}finally{
				
				System.out.println("finally");
			}
			
		}
		else
		{
			result1=cal1.addition(10,20);
			System.out.println(result1);
			result1=cal1.division(20,20);
			System.out.println(result1);
		}	
		*/
	}
}