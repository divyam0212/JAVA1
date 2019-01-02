public class Employee{
	
	public static void calcTax()
	{
		//2.5l- 0%
		//2.5-5- 10%
		//5-10l- 20%
		//above 10l- 30%

		int pack=5_00_000;		// for readability
		char gender='M';

		float salary=123434.5f;
		float totDeduction=0;
		float totSal=0;
		String country="INDIA";

		String message="tax applicable for your salary ";

		if(salary>0 && salary<250000)
		{
			if(country=="INDIA" && gender=='M'){
				System.out.println("NO TAX"+salary" for "+gender);
			}
			else
			{
				totDeduction=0.10f*salary;
				totSal=salary-totDeduction;
				System.out.println("10% "+message+salary+" :"+totSal);
			}
			if(country=="INDIA" && gender=='F'){
				System.out.println("NO TAX"+salary+" for "+gender);
			}
			else
			{
				totDeduction=0.10f*salary;
				totSal=salary-totDeduction;
				System.out.println("10% "+message+salary+" :"+totSal);
			}
		}
		else if(salary>250000 && salary<=500000)
		{
			if(country=="INDIA" && gender=='M'){
				
				totDeduction=0.10f*salary;
				totSal=salary-totDeduction;
				System.out.println("10% "+message+salary+" :"+totSal);
			}
			else
			{
				totDeduction=0.20f*salary;
				totSal=salary-totDeduction;
				System.out.println("10% "+message+salary+" :"+totSal);
			}
		}
		else if(salary>500000 && salary<=1000000)
		{
			if(country=="INDIA" && gender=='M'){
				
				totDeduction=0.20f*salary;
				totSal=salary-totDeduction;
				System.out.println("20% "+message+salary+" :"+totSal);
			}
			else
			{
				totDeduction=0.40f*salary;
				totSal=salary-totDeduction;
				System.out.println("40% "+message+salary+" :"+totSal);
			}
		}
		else if(salary>1000000)
		{
			if(country=="INDIA"){
				
				totDeduction=0.30f*salary;
				totSal=salary-totDeduction;
				System.out.println("30% "+message+salary+" :"+totSal);
			}
			else
			{
				totDeduction=0.60f*salary;
				totSal=salary-totDeduction;
				System.out.println("60% "+message+salary+" :"+totSal);
			}
		}
	}
	public static void main(String args[]){
		calcTax();
	}
}