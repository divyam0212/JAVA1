public class EmployeeAd{
	private Address address;
	private int empId;
	private String empName;
	private int age;
	private float salary;
	
	public void setSalary(float sal){
		this.salary=sal;
	}
	public float getSalary(){
		return this.salary;
	}
	public void setAddress(Address address){
		this.address=address;
	}
	public void setEmpId(int empId){
		this.empId=empId;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public void setAge(int age){
		this.age=age;
	}
	public Address getAddress(){
		return this.address;
	}
	public int getEmpId(){
		return this.empId;
	}
	public String setEmpName(){
		return this.empName;
	}
	public int getAge(){
		return this.age;
	}
	public EmployeeAd(){
	}
	public EmployeeAd(int empId,String empName,int age,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.age=age;
		this.salary=salary;
	}
	public EmployeeAd(int empId,String empName,int age,float salary,Address ad)
	{
		this.empId=empId;
		this.empName=empName;
		this.age=age;
		this.salary=salary;
		this.address=ad;
	}
	public String toString()
	{
		return "Employee ID: "+empId+"\nEmployee Name: "+empName+"\nEmployee Age: "+age+"\nSalary:"+salary+address;
	}
	
}