package com.facebook.service;
import com.facebook.model.IFacebook;
import com.facebook.model.UserDetails;
public class Facebook2 implements IFacebook{
	
	private UserDetails ud;
	public Facebook2(){
	}
	public Facebook2(UserDetails ud){
		this.ud=ud;
	}
	public UserDetails getUserDetails()
	{
		return this.ud;
	}
	public void setUserDetails(UserDetails ud)
	{
		this.ud=ud;
	}
	public void registerUser(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Logged In");
	}
	public void signIn(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Signed In");
	}
	public void likePost(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Liked the Post");
	}
	public void commentPost(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Commented the Post");
	}
	public void sharePost(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Shared the Post");
	}
	public void viewTimeline(UserDetails ud){
		System.out.println(ud.getUserName()+" "+ud.getPassword()+" Has Posted on Timeline");
	}
	/*public String toString(){
		return ud;
	}*/

/*	public static void print(){
		System.out.println("FACEBOOK");
	}*/
}