public class Acc2{
	public static double withdraw(double amt,double amount)
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
	public static double deposit(double amt,double amount)
	{
		amount+=amt;
		return amount;
	}
	public static void display(int acc,double balance)
	{
		System.out.println("ACCOUNT NUMBER: "+acc);
		System.out.println("BALANCE BEFORE WITHDRAWAL: "+balance);
	}
	static String data[];				// DATA LOADED ONLY ONCE
	static {
			data=new String[]{"1000,1000000.00,'W',200000","1000,1000000.00,'D',50000","1002,1400045.00,'D',2000","1003,130045.00,'D',30000","1003,120045.00,'W',40000","1004,120045.00,'D',40000","1005,110045.00,'W',50000"};
	}
	public static void main(String args[]){
		
		//String data[]={"1000,1000000.00,'W',200000","1000,1000000.00,'D',50000","1002,1400045.00,'D',2000","1003,130045.00,'D',30000","1003,120045.00,'W',40000","1004,120045.00,'D',40000","1005,110045.00,'W',50000"};
		

	
	//	int size=data.length;
		Acc2 accountArray[]=new Account[size];
		for(int i=0;i<data.length;i++)
		{
			String arr[]=data[i].split(",");
			int accNo=Integer.parseInt(arr[0]);
			double bal=Double.parseDouble(arr[1]);
			char type=arr[2].charAt(1);
			double amt=Double.parseDouble(arr[3]);
			
			display(accNo,bal);

			if(type=='W')
			{
				double val=withdraw(amt,bal);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			if(type=='D')
			{
				double val=deposit(amt,bal);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			
		}
	}
}