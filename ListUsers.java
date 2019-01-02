package com.uber.src;

import java.util.*;
import com.uber.src.UserDetails;

public class ListUsers{
	List<UserDetails> userList=new ArrayList<>();

	public void ListUsers(){
	}
	public void ListUsers(List<UserDetails> userList){
		this.userList=userList;
	}
	public List<UserDetails> getList(){
		return userList;
	}
	public void setList(List<UserDetails> userList){
		this.userList=userList;
	}
}