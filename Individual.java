public class Individual{
	float taxSlab1=0.10f;
	float taxSlab2=0.20f;
	float taxSlab3=0.30f;
	int slab[]={2500000,5000000,1000000};
	
	public void setSlabs(int slab[]){
		this.slab=slab;
	}
	public int[] getSlabs(){
		return this.slab;
	}
	public void setTaxSlab1(float taxSlab1)
	{	
		this.taxSlab1=taxSlab1;
	}
	public void setTaxSlab2(float taxSlab2)
	{	
		this.taxSlab2=taxSlab2;
	}
	public void setTaxSlab3(float taxSlab3)
	{	
		this.taxSlab3=taxSlab3;
	}
	public float getTaxSlab1()
	{	
		return this.taxSlab1;
	}
	public float getTaxSlab2()
	{	
		return this.taxSlab2;
	}
	public float getTaxSlab3()
	{	
		return this.taxSlab3;
	}
	public Individual(){	
	}
	public Individual(float taxSlab1,float taxSlab2,float taxSlab3){
		this.taxSlab1=taxSlab1;
		this.taxSlab2=taxSlab2;
		this.taxSlab3=taxSlab3;
	}
	public Individual(float taxSlab1,float taxSlab2,float taxSlab3,int slab[]){
		this.taxSlab1=taxSlab1;
		this.taxSlab2=taxSlab2;
		this.taxSlab3=taxSlab3;
		this.slab=slab;
	}
	public void display(){
		System.out.println("I AM FROM INDIVIDUAL TAX CALCUALTOR");
	}
	public void calcTax(float salary,int age)
	{
		float tax=0.0f;
	      	if(age<60)
		{
			if(salary>0 && salary<slab[0]){
				tax=0.0f;			
			}
			else if(salary>slab[0] && salary<=slab[1])
			{
				tax=tax+taxSlab1*(salary-slab[0]);
			}
			else if(salary>slab[1] && salary<=slab[2])
			{
				tax=tax+taxSlab1*slab[0]+taxSlab2*(salary-slab[1]);
			}
			else if(salary>slab[2])
			{
				tax=tax+taxSlab1*slab[0]+taxSlab2*slab[1]+taxSlab3*(salary-slab[2]);
			}
		}
	     	else if(age>=60 && age<80)
	     	{
			if(salary>0 && salary<slab[0]){
				tax=0.0f;			
			}
			else if(salary>slab[0] && salary<=slab[1])
			{
				tax=tax+taxSlab1*(salary-slab[0]);
			}
			else if(salary>slab[1] && salary<=slab[2])
			{
				tax=tax+taxSlab1*slab[0]+taxSlab2*(salary-slab[1]);
			}
			else if(salary>slab[2])
			{
				tax=tax+taxSlab1*slab[0]+taxSlab2*slab[1]+taxSlab3*(salary-slab[2]);
			}
		}
		System.out.println("TAX TO BE PAID: "+tax);
	}
}