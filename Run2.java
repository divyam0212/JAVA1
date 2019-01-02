public class Run2
{
	public static void display(AccountDemo acc)
	{
		System.out.println("ACCOUNT NUMBER: "+acc.getAccNo());
		System.out.println("BALANCE BEFORE WITHDRAWAL: "+acc.getBalance());
	}
	public static double withdraw(AccountDemo acc)
	{
		if(acc.getAmount()>acc.getBalance())
		{
			System.out.println("MAINTAIN MINIMUM BALANCE");
		}
		else
		{
			
			double newBalance=acc.getBalance()-acc.getAmount();
			acc.setBalance(newBalance);
		}
		return acc.getBalance();
	}
	public static double deposit(AccountDemo acc)
	{
		double newBalance=acc.getBalance()+acc.getAmount();
		acc.setBalance(newBalance);
		return acc.getBalance();
	}
	public static void main(String args[])
	{
		String[] data={"1000,1000000.00,'W',200000","1000,1000000.00,'D',50000","1002,1400045.00,'D',2000","1003,130045.00,'D',30000","1003,120045.00,'W',40000","1004,120045.00,'D',40000","1005,110045.00,'W',50000"};
		for(int i=0;i<data.length;i++)
		{
			String arr[]=data[i].split(",");
			int ac=Integer.parseInt(arr[0]);
			double balanceAmount=Double.parseDouble(arr[1]);
			char transType=arr[2].charAt(1);
			double amount=Double.parseDouble(arr[3]);

			AccountDemo ad=new AccountDemo(ac,balanceAmount,transType,amount);
			System.out.println(ad);    // prints details of account because toString function is defined
			

			if(ad.getTransType()=='W')
			{
				double val=withdraw(ad);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			if(ad.getTransType()=='D')
			{
				double val=deposit(ad);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			
		}
		
	}
	
}