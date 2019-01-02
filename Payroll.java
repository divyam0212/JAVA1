public class Payroll{
	public static void main(String args[]){
		String name="Name: ";
		String genderis="Gender: ";
		String sal="Salary: ";
		String taxis="Tax: ";
		String not="NO TAX";
		char gender='M';
		String country="INDIA";

		float salary=2500000f;
		float totSal=0;
		float totDeduction=0;

		if(salary>0 && salary<=250000)
		{
			if(country=="INDIA" && gender=='M')
			{
				System.out.println(name+"ABC"+"\n"+genderis+"M"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="INDIA" && gender=='F')
			{
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="INDIA" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="US" && gender=='M')
			{
				totDeduction=.10f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='F')
			{
				totDeduction=.05f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			
		}
		if(salary>250000 && salary<=500000)
		{
			if(country=="INDIA" && gender=='M')
			{
				totDeduction=.10f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='F')
			{
				totDeduction=.20f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="US" && gender=='M')
			{
				totDeduction=.20f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='F')
			{
				totDeduction=.10f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			
		}
		if(salary>500000 && salary<=1000000)
		{
			if(country=="INDIA" && gender=='M')
			{
				totDeduction=.20f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='F')
			{
				totDeduction=.30f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="US" && gender=='M')
			{
				totDeduction=.25f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='F')
			{
				totDeduction=.20f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			
		}
		if(salary>1000000)
		{
			if(country=="INDIA" && gender=='M')
			{
				totDeduction=.35f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='F')
			{
				totDeduction=.35f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="INDIA" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			else if(country=="US" && gender=='M')
			{
				totDeduction=.30f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"ABC"+"\n"+genderis+"M"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='F')
			{
				totDeduction=.30f*salary;
				totSal=salary-totDeduction;
				System.out.println(name+"BCD"+"\n"+genderis+"F"+"\n"+sal+salary+"\n"+taxis+totDeduction);
			}
			else if(country=="US" && gender=='O')
			{
				System.out.println(name+"EFG"+"\n"+genderis+"O"+"\n"+sal+salary+"\n"+taxis+not);
			}
			
		}
	}
}