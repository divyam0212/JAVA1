package com.facebook.run;
import com.facebook.model.*;
import com.facebook.service.Facebook2;

public class FacebookRun{
	public static void main(String args[]){
/*		IFacebook fb=new Facebook();
		fb.registerUser("ABC","abc@123","abc@gmail.com",12345678);
		fb.signIn("ABC","abc@123");
		fb.likePost("ABC","abc@123");
		fb.commentPost("ABC","abc@123");
		fb.sharePost("ABC","abc@123");
		fb.viewTimeline("ABC","abc@123");
		Facebook.print();

		fb=new Facebook2();		
		fb.registerUser("ABC","abc@123","abc@gmail.com",12345678);
		fb.signIn("ABC","abc@123");
		fb.likePost("ABC","abc@123");
		fb.commentPost("ABC","abc@123");
		fb.sharePost("ABC","abc@123");
		fb.viewTimeline("ABC","abc@123");*/
	
		
		UserDetails user=new UserDetails("ABC","abc@123","abc@gmail.com","123456789");
		IFacebook fb=new Facebook2(user);
		fb.registerUser(user);
		fb.signIn(user);
		fb.likePost(user);
		fb.commentPost(user);
		fb.sharePost(user);
		fb.viewTimeline(user);
	}
}