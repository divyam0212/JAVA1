import java.util.*;
public class Accounts
{
	char transType;
	double transAmt;		
	String name;	
	int accNo;
	double creditBalance;
	int rewardPoint;
	
	public char getTransType(){
		return this.transType;
	}
	public void setTransType(char transType){
		this.transType=transType;
	}
	public int getRewardPoint(){
		return this.rewardPoint;
	}
	public void setRewardPoint(int accNo){
		this.rewardPoint=rewardPoint;
	}
	public int getAccountNo(){
		return this.accNo;
	}
	public void setAccount(int accNo){
		this.accNo=accNo;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getCreditBalance(){
		return this.creditBalance;
	}
	public void setCreditBalance(double creditBalance){
		this.creditBalance=creditBalance;
	}
	public double getTransAmt(){
		return this.transAmt;
	}
	public void setTransAmt(double transAmt){
		this.transAmt=transAmt;
	}

	public double withdraw(double amt,double creditBalance)
	{
		creditBalance-=amt;
		if(amt>0)
		{
			int offer=(int)amt/10;
			this.rewardPoint+=offer;
		}
		return creditBalance;
	}
	public double deposit(double amt,double creditBalance)
	{
		if(creditBalance<0) 			// no loan
			creditBalance+=amt;
		return creditBalance;
	}

	public Accounts(){
	}
	public Accounts(int accNo,String name,double creditBalance,char transType,double transAmt){
		this.accNo=accNo;
		this.name=name;
		this.creditBalance=creditBalance;
		this.transAmt=transAmt;
	}
	public String toString(){
		return "ACCOUNT NUMBER: "+accNo+"\nACCOUNT HOLDER: "+name+"\nAMOUNT TO BE PAID BACK: "+creditBalance+"\nCURRENT REWARDS POINTS: "+rewardPoint;
	}
	public static void main(String args[])
	{
		int acc;
		double a;
		Accounts ac=new Accounts(100,"ABC",0,'T',5000);

		if(ac.getTransType()=='T')
		{
						System.out.println(ac);
						a=ac.withdraw(ac.getTransAmt(),ac.getCreditBalance());
						ac.setCreditBalance(a);
						System.out.println(ac);
		}
		else if(ac.getTransType()=='P')
		{
						System.out.println(ac);
						a=ac.deposit(ac.getTransAmt(),ac.getCreditBalance());
						ac.setCreditBalance(a);
						System.out.println(ac);
		}
		
	}
}