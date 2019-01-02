public interface IBank{
	
	static final String BANK_NAME="SBI";			// constants declared in caps and words separated with underscore.
	public void read(String[] data);				// only declaration comes
	public void calcTax(double salary,int age);
}