public class RunMain{
	public static void main(String args[]){
		
		int slabs[]={250000,600000,1200000};
		Individual ind=new Individual(0.10f,0.20f,0.30f,slabs);
		ind.calcTax(296000,21);

//		SeniorCitizen s=new SeniorCitizen(0.05f,0.10f,0.20f,slabs);
//		s.calcTax(296000,70);
//		s.message();

		Individual ind1=new SeniorCitizen(0.05f,0.10f,0.20f,slabs);	// super class reference varible and subclass object.Run time polymorphism
		ind1.calcTax(296000,70);
		ind1.display();	
//		ind1.show();

//		ind1.message();
		// Individual which is not there in senior tax calc
		// call overridden method from seniortax cal

	//	HUF huf=new HUF(0.15f,0.25f,0.35f,slabs);
	//	huf.calcTax(296000,75);
		
	//	ind=new HUF(0.15f,0.25f,0.35f,slabs);
	//	ind.calcTax(296000,75);

	}
}