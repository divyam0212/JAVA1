public class TaxCalculator{
	private EmployeeAd employee;
	private float tax;

	public void setEmployee(EmployeeAd employee){
		this.employee=employee;
	}
	public EmployeeAd getEmployee(){
		return this.employee;
	}
	public void setTax(float tax){
		this.tax=tax;
	}
	public float getTax(){
		return this.tax;
	}
	public float calcTax(EmployeeAd employee){
		tax=0.0f;
	      if(employee.getAge()<60){
		if(employee.getSalary()>0 && employee.getSalary()<250000){
			tax=0.0f;			
		}
		else if(employee.getSalary()>250000 && employee.getSalary()<=500000)
		{
			tax=tax+0.10f*(employee.getSalary()-250000);
		}
		else if(employee.getSalary()>500000 && employee.getSalary()<=1000000)
		{
			tax=tax+0.10f*250000+0.20f*(employee.getSalary()-500000);
		}
		else if(employee.getSalary()>1000000)
		{
			tax=tax+0.10f*250000+0.20f*500000+0.30f*(employee.getSalary()-1000000);
		}
	     }
	     else if(employee.getAge()>=60 && employee.getAge()<80)
	     {
		if(employee.getSalary()>0 && employee.getSalary()<250000){
			tax=0.0f;			
		}
		else if(employee.getSalary()>250000 && employee.getSalary()<=500000)
		{
			tax=tax+0.05f*(employee.getSalary()-250000);
		}
		else if(employee.getSalary()>500000 && employee.getSalary()<=1000000)
		{
			tax=tax+0.05f*250000+0.10f*(employee.getSalary()-500000);
		}
		else if(employee.getSalary()>1000000)
		{
			tax=tax+0.05f*250000+0.10f*500000+0.20f*(employee.getSalary()-1000000);
		}
	     }
		return tax;
	}
	public TaxCalculator(){
	}
	public TaxCalculator(EmployeeAd employee){
		this.employee=employee;
	}
	public TaxCalculator(EmployeeAd employee,float tax){
		this.employee=employee;
		this.tax=tax;
	}
	public String toString(){
		return employee+"\nTax Deducted: "+tax;
	}	
}