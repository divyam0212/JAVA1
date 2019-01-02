public class BankImpl implements IBank{
	
	public void read(String[] data){
		System.out.println(data);
	}
	public void calcTax(double salary,int age){
		System.out.println("Process tax for"+salary+"Age: "+age+"person");
	}
	public static void main(String args[]){
		IBank bank=new BankImpl();
		String data[]={"data"};
		bank.read(data);
		bank.calcTax(1234.4f,21);
	}

}