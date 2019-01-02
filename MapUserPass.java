import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
public class MapUserPass{
	public static void main(String args[]){

			LocalDate date=LocalDate.now();
			System.out.println(date);

			date=date.minusDays(2);
			System.out.println(date);
			LocalTime time=LocalTime.now();
			System.out.println(time);
			LocalDateTime dateTime=LocalDateTime.now();
			System.out.println(dateTime);

			Instant inst=Instant.now();
			System.out.println(inst);
			HashMap<String,String> mapUsers=new HashMap<String,String>();


		/*	mapUsers.put("abc","abc123");
			mapUsers.put("def","def123");
			mapUsers.put("efg","efg123");
			mapUsers.put("klm","klm123");
			mapUsers.put("pqr","pqr123");

		//	System.out.println(mapUsers);
			System.out.println("UserNames:");
			Collection<String> userName=mapUsers.keySet();
			System.out.println(userName);
			System.out.println("Passwords");
			Collection<String> password=mapUsers.values();
			System.out.println(password);*/

			Scanner sc=new Scanner(System.in);
			String userName;
			String password;
			char ch;

			do{
				System.out.println("Enter username:");
				userName=sc.next();
				System.out.println("Enter the password");
				password=sc.next();
				mapUsers.put(userName,password);

				System.out.println("Do you want to continue");
				ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');

			//System.out.println("UserNames:");

			Collection<String> users=mapUsers.keySet();   		// keySet() returns collection of keys
			Collection<String> passwords=mapUsers.values();		// values() returns collections of values
			System.out.println(users+"->"+passwords);
			//System.out.println("Passwords");

			//Collection<String> passwords=mapUsers.values();		// values() returns collections of values

			//System.out.println(passwords);
			// to remove [ ]
			Set<String> setUserName=mapUsers.keySet();
			Iterator<String> iter=setUserName.iterator();
			while(iter.hasNext()){
				String uname=iter.next();
				String pass=mapUsers.get(uname);
				System.out.println(uname+"->"+pass);
			}

	}
}