public class AccountDemo
{
	private int accNo;
	private double bal;
	private char type;
	private double amt;
	
	public AccountDemo()
	{
	}
	public AccountDemo(int accNo,double bal,char type,double amt)
	{
		this.accNo=accNo;
		this.bal=bal;
		this.type=type;
		this.amt=amt;	
	}
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public void setBalance(double bal)
	{
		this.bal=bal;
	}
	public void setTransType(char type)
	{
		this.type=type;
	}
	public void setAmount(double amt)
	{
		this.amt=amt;
	}
	public int getAccNo()
	{
		return this.accNo;
	}
	public double getBalance()
	{
		return this.bal;
	}
	public char getTransType()
	{
		return this.type;
	}
	public double getAmount()
	{
		return this.amt;
	}
	public String toString()
	{
		return "Account Number: "+accNo+"\nBalance: "+bal+"\nTransaction Type: "+type+"\nTransaction Amount: "+amt;
	}
}