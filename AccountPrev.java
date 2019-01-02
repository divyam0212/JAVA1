import java.util.*;
public class Account{
	public static void main(String args[]){
		
		char transType;
		float transAmt;		
		String name;	
		int accNo;
		float amount;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number:");
		accNo=sc.nextInt();
		System.out.println("Enter Account Holder Name:");
		name=sc.nextLine();
		System.out.println("Enter Balance:");
		amount=sc.nextFloat();
		System.out.println("PRESS:\nW:Withdraw\nD:Deposit");
		transType=sc.next().charAt(0);

		if(transType=='W'){
			System.out.print("Enter the amount to withdraw: ");
			transAmt=sc.nextFloat();
			if(transAmt<amount){
				System.out.println("ACCOUNT NUMBER: "+accNo);
				System.out.println("ACCOUNT HOLDER: "+name);
				System.out.println("BALANCE BEFORE WITHDRAWAL: "+amount);
				amount-=transAmt;
				System.out.println("BALANCE AFTER WITHDRAWAL: "+amount);
			}
			else
			{
				System.out.println("MAINTAIN MINIMUM BALANCE");
			}
		}
		else if(transType=='D'){
			System.out.print("Enter the amount to deposit:");
			transAmt=sc.nextFloat();
			System.out.println("ACCOUNT NUMBER: "+accNo);
			System.out.println("ACCOUNT HOLDER: "+name);
			System.out.println("BALANCE BEFORE WITHDRAWAL: "+amount);
			amount+=transAmt;
			System.out.println("BALANCE AFTER WITHDRAWAL: "+amount);
		}
	}
}