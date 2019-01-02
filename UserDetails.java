package com.facebook.model;
public class UserDetails{
	String userName;
	String password;
	String email;
	String phone;
	
	public UserDetails(){
	}
	public UserDetails(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	public UserDetails(String userName,String password,String email,String phone){
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.phone=phone;
	}
	public String getUserName()	
	{
		return this.userName;
	}
	public String getPassword()
	{
		return this.password;
	}
	public String getEmail()
	{	
		return this.email;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	public String toString(){
		return "USERNAME: "+userName+"\nPASSWORD: "+password+"\nEMAIL: "+email+"\nPHONE: "+phone;
	}
}
