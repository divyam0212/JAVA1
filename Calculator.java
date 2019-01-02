package com.cts.calculator;
public class Calculator{
	public Calculator(){	
		
	}
	public int addition(int number1,int number2){
		int c=number1+number2;
		return c;
	}
	public int division(int number1,int number2){
		int c=0;
		c=number1/number2;
	/*	try{
			c=number1/number2;
		}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception Handled");
			c=number1/1;
		}*/
		return c;
	}
}