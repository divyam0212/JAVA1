import java.util.*;
import java.io.*;

public class BankThread2 implements Runnable
{
	public void run()
	{


		
		//String data[]={"1000,1000000.00,'W',200000","1000,1000000.00,'D',50000","1002,1400045.00,'D',2000","1003,130045.00,'D',30000","1003,120045.00,'W',40000","1004,120045.00,'D',40000","1005,110045.00,'W',50000"};
		FileReader fr=null;
		BufferedReader br=null;		
		Acc22 acc;
	//	int size=data.length;
	//	Acc22 accArray[]=new Acc22[size];
		String line=null;
		ArrayList<Acc22> listAccount=new ArrayList<Acc22>();
		
		List<Acc22> listAccount2=new ArrayList<>();
	   	try{

	   		fr=new FileReader("D:\\divya\\data2.txt");
	   		br=new BufferedReader(fr);
	   		while((line=br.readLine())!=null)
	   		{
	   				String arr[]=line.split(",");
					int accNo=Integer.parseInt(arr[0]);
					double bal=Double.parseDouble(arr[1]);
					char type=arr[2].charAt(1);
					double amt=Double.parseDouble(arr[3]);
			
					acc=new Acc22(accNo,bal,type,amt);

				//	accArray[i]=acc;

					listAccount.add(acc);

					listAccount2.add(acc);

					System.out.println(acc);
			
					if(acc.getTransType()=='W')
					{
						double val=acc.withdraw(amt,bal);
						System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ie){
							System.out.println(ie.getMessage());
						}
						
					}
					if(acc.getTransType()=='D')
					{
						double val=acc.deposit(amt,bal);
						System.out.println("BALANCE AFTER WITHDRAWAL: "+val);
						try{
							Thread.sleep(1000);
						}catch(InterruptedException ie){
							System.out.println(ie.getMessage());
						}
						
					}
			
		   	}
		}
		catch(FileNotFoundException fio){
			System.out.println("File not found");
		}
		catch(IOException io){
			System.out.println("IO EXCEPTION");
		}
		finally
		{
			try{
				if(br!=null){
					br.close();
				}
			}
			catch(IOException io){
				System.out.println("Error in closing file");
			}
		}


		/*	for(int i=0;i<data.length;i++)
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

//				System.out.println(acc);
			
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
		}*/
		

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
		
		while(it.hasNext())	{
			Acc22 c=it.next();
			System.out.println(c);
		}

	}
}