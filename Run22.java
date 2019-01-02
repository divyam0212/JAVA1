import java.util.*;
public class Run22{
	public static List<Acc22> getList()
	{
		
		String data[]={"1000,1000000.00,'W',200000","1000,1000000.00,'D',50000","1002,1400045.00,'D',2000","1003,130045.00,'D',30000","1003,120045.00,'W',40000","1004,120045.00,'D',40000","1005,110045.00,'W',50000"};
		Acc22 acc;
		int size=data.length;
		Acc22 accArray[]=new Acc22[size];
		
		ArrayList<Acc22> listAccount=new ArrayList<Acc22>();
		
		List<Acc22> listAccount2=new ArrayList<>();
		for(int i=0;i<data.length;i++)
		{
			String arr[]=data[i].split(",");
			int accNo=Integer.parseInt(arr[0]);
			double bal=Double.parseDouble(arr[1]);
			char type=arr[2].charAt(1);
			double amt=Double.parseDouble(arr[3]);
			
			acc=new Acc22(accNo,bal,type,amt);

			accArray[i]=acc;

			listAccount.add(acc);

			listAccount2.add(acc);

//			System.out.println(acc);
			
			if(acc.getTransType()=='W')
			{
				double val=acc.withdraw(amt,bal);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			if(acc.getTransType()=='D')
			{
				double val=acc.deposit(amt,bal);
				System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
			}
			
		}

	//	Scanner sc=new Scanner(System.in);
	/* 	System.out.println("ENTER THE ACCOUNT NUMBER: ");
		String ac=sc.nextLine();
		for(int i=0;i<accArray.length;i++){
			String test=String.valueOf(accArray[i].getAccNo());
			if(test.equals(ac)){
				System.out.println(accArray[i]);
				break;
*/
		Iterator<Acc22> it=listAccount.iterator();
	/*	for(Acc22 account:listAccount){
			System.out.println(account);
		}*/
		
		/*while(it.hasNext())	{
			Acc22 c=it.next();
			System.out.println(c);
		}*/

		return listAccount;
	}
	public static void main(String args[]){
		
		List<Acc22> details=getList();			// method returns list.. implements runtime polymorphism.. getlist returns arraylist;
		System.out.println(details);

		
		
	}
}