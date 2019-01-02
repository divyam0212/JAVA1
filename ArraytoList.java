package com.facebook.run;
import java.util.*;
import com.facebook.model.UserDetails;
public class ArrayToList
{
/*	IFacebook getFacebook(){
		return new Facebook();
	}*/
	public static Set<UserDetails> getSet(){
		UserDetails[] user= new UserDetails[3];
		user[0]=new UserDetails("user1","1232324","user1@gmail.com","238435");
		user[1]=new UserDetails("user2","1232324","user2@gmail.com","431545");
		user[2]=new UserDetails("user3","1232324","user2@gmail.com","431545");

		Set<UserDetails> setUser=new HashSet();
		System.out.println(list);
		
		System.out.println(list);
	}
	public static void main(String args[]) throws InterruptedException{

	/*	ArrayList<String> list=new ArrayList<String>();
		System.out.println(list);
		list.add("abs");

		list.add("13235");
		list.add("new Date()");
		list.add("M");
		list.add("fhdjhjjk");
		System.out.println(list);
		
		String name1=list.get(1);		
		System.out.println("string in index1 is:"+name1);
		Iterator<String> it=list.iterator();
		while(it.hasNext()){

		//	Object o=it.next();
			String o=it.next();
		//	if(o instanceof String){
				String value=o.toString();
				System.out.println("STRING VALUE FROM LIST: "+value);
				if(value.equals("abs")){
					it.remove();
		//		}
			}
		//	System.out.println(o);
		}*/
	/*	System.out.println(list);
		UserDetails[] user= new UserDetails[3];
		user[0]=new UserDetails("user1","1232324","user1@gmail.com","238435");
		user[1]=new UserDetails("user2","1232324","user2@gmail.com","431545");
		user[2]=new UserDetails("user3","1232324","user2@gmail.com","431545");
	
		List<UserDetails> listUser=Arrays.asList(user);
		System.out.println("ARRAY LIST: "+listUser);*/
		
		/*Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println(new Date());
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<3;i++)
		{
			if(user[i].getUserName().equals(name))
			{
				System.out.println(user[i]);
				Thread.sleep(100);
			}
		}
		System.out.println(System.currentTimeMillis());*/




	}
}