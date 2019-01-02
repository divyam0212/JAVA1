import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadRun{

	public static void main(String args[])
	{
		/*	Thread1 t=new Thread1();
			t.setName("thread1");
			t.start();

			Thread1 t2=new Thread1();
			t2.setName("thread2");
			t2.start(); */

			final int MAX_POOL=3;
			BankThread1 bank1=new BankThread1();
			BankThread2 bank2=new BankThread2();

			Thread t=new Thread(bank1);
			Thread t2=new Thread(bank2);

			System.out.println("ID: "+t.getId());
			System.out.println("PRIORITY: "+t.getPriority());
			System.out.println("STATE: "+t.getState());	
			t.start();


			System.out.println("ID: "+t2.getId());
			System.out.println("PRIORITY: "+t2.getPriority());
			System.out.println("STATE: "+t2.getState());

			t2.start();
			//bank1.start();
			//bank2.start();	

/*			ExecutorService pool=Executors.newFixedThreadPool(MAX_POOL);
			pool.execute(bank1);
			pool.execute(bank2);

			pool.shutdown();
			*/
	/*		try
			{
				bank1.join();
				bank2.join();

				bank1.start();
				bank2.start();
			}
			catch(InterruptedException ie){
				System.out.println("INTERRUPTED EXCEPTION");
			}*/
	}
}