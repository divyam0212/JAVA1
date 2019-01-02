package com.cdr.app;

import com.cdr.bin.*;
import java.io.*;
import java.util.stream.*;

public class Bill
{
	public static void main(String args[])
	{
		Customer customer=null;

		List<Customer> customerList=new ArrayList<>();
		try
		{
				String path="D:\\divya\\assess\\cdr.txt";
				ReaderWriter readerFile=new ReaderWriter();
				customerList=readerFile.readFile(path);
				
		}
		catch(BillException billExcep)
		{
				System.out.println(billExcep.getMessage());
		}
		
		Map<String,List<Customer>> mapCustomer=customerList.stream().collect(Collectors.groupingBy(Customer::getCustNo));		/// grouping list using customerNo

		PrintBill generate=new PrintBill();
		generate.printBill(mapCustomer);
	}
}