public class EmpAdd{
	public static void main(String args[]){
		
		Address ad=new Address(121,"ALAPPUZHA","KERALA");
		EmployeeAd ea=new EmployeeAd(1000,"DIVYA",21,296000,ad);
		TaxCalculator taxCal=new TaxCalculator(ea);
		taxCal.calcTax(ea);
		System.out.println(taxCal);
		
		EmployeeAd ea1=new EmployeeAd(1001,"ABC",70,300000,ad);
		TaxCalculator taxCal1=new TaxCalculator(ea1);
		taxCal.calcTax(ea1);
		System.out.println(taxCal1);
	}
}