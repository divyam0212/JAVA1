//import java.util.*;
public class Day{
	
/*	public static void dayPrint(int day)
	{
		if(day==1)
		{
			System.out.println("MONDAY");
		}
		else if(day==2)
		{
			System.out.println("TUESDAY");
		}
		else if(day==3)
		{
			System.out.println("WEDNESDAY");
		}
		else if(day==4)
		{
			System.out.println("THURSDAY");
		}
		else if(day==5)
		{
			System.out.println("FRIDAY");
		}
		else if(day==6)
		{
			System.out.println("SATURDAY");
		}
		else if(day==7)
		{
			System.out.println("SUNDAY");
		}
		else
		{
			System.out.println("NO DAY");
		}
		switch(day)
		{
			case 1:System.out.println("MONDAY");break;
			case 2:System.out.println("TUESDAY");break;
			case 3:System.out.println("WEDNESDAY");break;
			case 4:System.out.println("THURSDAY");break;
			case 5:System.out.println("FRIDAY");break;
			case 6:System.out.println("SATURDAY");break;
			case 7:System.out.println("SUNDAY");break;			
			default: System.out.println("NO DAY");break;
		}
	}*/
	public static void main(String args[])
	{

                /*int day;
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		dayPrint(day);*/

		String days[]={"monday","Tuesday","wednesday","thursday","friday","saturday","sunday"};
		for(String day:days)
		{
			System.out.println(day);
		}
	}
}