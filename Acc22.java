public class Acc22{
	private int accNo;
	private double bal;
	private char type;
	private double amt;
	
	public Acc22()
	{
	}
	public Acc22(int accNo,double bal,char type,double amt)
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
		return "\nAccount Number: "+accNo+"\nBalance: "+bal+"\nTransaction Type: "+type+"\nTransaction Amount: "+amt;
	}
	public synchronized double withdraw(double amt,double bal)
	{
		if(amt<bal)
		{
			bal-=amt;
		}
		else
		{
			System.out.println("MAINTAIN MINIMUM BALANCE");
		}
		return bal;
	}
	public double deposit(double amt,double bal)
	{
		bal+=amt;
		return bal;
	}
}