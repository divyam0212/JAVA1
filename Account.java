import java.util.*;
public class Account
{
	public float withdraw(float amt,float amount)
	{
		if(amt<amount)
		{
			amount-=amt;
		}
		else
		{
			System.out.println("MAINTAIN MINIMUM BALANCE");
		}
		return amount;
	}
	public float deposit(float amt,float amount)
	{
		amount+=amt;
		return amount;
	}
	public static void display(int acc,String name,float balance)
	{
		System.out.println("ACCOUNT NUMBER: "+acc);
		System.out.println("ACCOUNT HOLDER: "+name);
		System.out.println("BALANCE BEFORE WITHDRAWAL: "+balance);
	}
	public static void main(String args[])
	{
		char transType;
		float transAmt;		
		String[] name={"ABC","DEF","GHI"};	
		int[] accNo={1000,1001,1002};
		float[] amount={12000,10000,25000};
		int acc;
		char c;
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		acc=sc.nextInt();
		do
		{
			System.out.println("PRESS:\nW:Withdraw\nD:Deposit");
			transType=sc.next().charAt(0);
			int i;
			for(i=0;i<accNo.length;i++)
			{
				if(acc==accNo[i])
				{
					if(transType=='W')
					{
						
						System.out.print("Enter the amount to withdraw: ");
						transAmt=sc.nextFloat();

						display(accNo[i],name[i],amount[i]);

						amount[i]=a.withdraw(transAmt,amount[i]);
						System.out.println("BALANCE AFTER WITHDRAWAL: "+amount[i]);	
					}
					else if(transType=='D')
					{
						System.out.print("Enter the amount to deposit:");
						transAmt=sc.nextFloat();
						display(accNo[i],name[i],amount[i]);

						if(transAmt>100000){				// if transaction amount greater than 1lakh add 2% interest- promotional offer
							amount[i]=amount[i]+0.2f*amount[i];	
						}
					
						amount[i]=a.deposit(transAmt,amount[i]);
						System.out.println("BALANCE AFTER WITHDRAWAL: "+amount[i]);
					}
					break;
				}
			}
			System.out.println("DO YOU WANT TO CONTINUE?");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		
	}
}