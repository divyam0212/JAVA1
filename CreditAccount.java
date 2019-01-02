import java.util.*;
public class CreditAccount
{
	char transType;
	double transAmt;		
	String name;	
	int accNo;
	double creditBalance;
	int rewardPoint;
	public CreditAccount(){
	}
	public CreditAccount(int accNo,String name,double creditBalance,char transType,double transAmt){
		this.accNo=accNo;
		this.name=name;
		this.creditBalance=creditBalance;
		this.transAmt=transAmt;
		this.transType=transType;
	}
	
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

	public void withdraw(double amt,double creditBalance)
	{
		creditBalance-=amt;
		setCreditBalance(creditBalance);
		if(amt>0)
		{
			int offer=(int)amt/10;
			rewardPoint=rewardPoint+offer;
			setRewardPoint(rewardPoint);
		}
	}
	public double deposit(double amt,double creditBalance)
	{
		if(creditBalance<0)
			creditBalance+=amt;
		return creditBalance;
	}


	public String toString(){
		return "ACCOUNT NUMBER: "+accNo+"\nACCOUNT HOLDER: "+name+"\nAMOUNT TO BE PAID BACK: "+creditBalance+"\nCURRENT REWARDS POINTS: "+rewardPoint+" trans type"+transType;
	}
	public static void main(String args[])
	{
		int acc;
		double a;
		CreditAccount ac=new CreditAccount(100,"ABC",0,'T',5000);
		if(ac.getTransType()=='T')
		{
						
						ac.withdraw(ac.getTransAmt(),ac.getCreditBalance());
						
						System.out.println(ac);
		}
		else if(ac.getTransType()=='P')
		{
						
						ac.deposit(ac.getTransAmt(),ac.getCreditBalance());
						
						System.out.println(ac);
		}
		//System.out.println(ac);
		
	}
}