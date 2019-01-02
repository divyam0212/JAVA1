public class IndianTax{
	private int age;
	float taxSlab=0.10;
	float taxSlab=0.20
	public static float calcTax(float salary){
		float tax=0.0f;
	   if(age<60){
		if(salary>0 && salary<250000){
			tax=0.0f;			
		}
		else if(salary>250000 && salary<=500000)
		{
			tax=tax+0.10f*(salary-250000);
		}
		else if(salary>500000 && salary<=1000000)
		{
			tax=tax+0.10f*250000+0.20f*(salary-500000);
		}
		else if(salary>1000000)
		{
			tax=tax+0.10f*250000+0.20f*500000+0.30f*(salary-1000000);
		}
       	  }
	  else if(age>=60 && age<80)
	  {
		if(salary>0 && salary<250000){
			tax=0.0f;			
		}
		else if(salary>250000 && salary<=500000)
		{
			tax=tax+0.05f*(salary-250000);
		}
		else if(salary>500000 && salary<=1000000)
		{
			tax=tax+0.05f*250000+0.10f*(salary-500000);
		}
		else if(salary>1000000)
		{
			tax=tax+0.05f*250000+0.10f*500000+0.20f*(salary-1000000);
		}
	  }
		return tax;
	}
	public static void main(String args[]){
		float salary=700000f;
		float tax=0.0f;
		float totSal=0.0f;
		
		tax=calcTax(salary);
		System.out.println("Name: DIVYA");
		System.out.println("Salary: "+salary);
		System.out.println("Tax Payable: "+tax);
		System.out.println("Total Salary: "+(salary-tax));
	}
}