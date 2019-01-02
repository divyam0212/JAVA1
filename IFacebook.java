package com.facebook.model;
public interface IFacebook{
	
	public void registerUser(UserDetails ud);
	public void signIn(UserDetails ud);
	public void likePost(UserDetails ud);
	public void commentPost(UserDetails ud);
	public void sharePost(UserDetails ud);
	public void viewTimeline(UserDetails ud);
}