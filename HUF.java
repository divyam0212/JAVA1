public class HUF extends Individual{

	public HUF(){	
	}
	public HUF(float taxSlab1,float taxSlab2,float taxSlab3,int slabs[]){
		super(taxSlab1,taxSlab2,taxSlab3,slabs);
		
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
		System.out.println("I AM FROM HUF TAX CALCULATOR CLASS");
		System.out.println("TAX TO BE PAID: "+tax);
	}
}
