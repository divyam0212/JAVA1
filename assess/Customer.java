package com.cdr.bin;
import java.time.*;
public class Customer{
	int transId;
	String custNo;
	String mobileNo;
	int plan;
	LocalDateTime date;
	int duration;

	// creating constructors for the class Customer
	public Customer(){

	}
	public Customer(int transId,String custNo,String mobileNo,int plan,LocalDateTime date,int duration){
		this.transId=transId;
		this.custNo=custNo;
		this.mobileNo=mobileNo;
		this.plan=plan;
		this.date=date;
		this.duration=duration;
	}
	// setters for customer class
	public void setTransId(int transId){
		this.transId=transId;
	}
	public void setPlanDetails(int plan){
		this.plan=plan;
	}
	public void setDuration(int duration){
		this.duration=duration;
	}
	public void setCustNo(String custNo){
		this.custNo=custNo;
	}
	public void setMobile(String mobileNo){
		this.mobileNo=mobileNo;
	}
	public void setDate(LocalDateTime date){
		this.date=date;
	}
	// getters for customer class
	public int getTransId(){
		return this.transId;
	}
	public int getPlan(){
		return this.plan;
	}
	public int getDuration(){
		return this.duration;
	}
	public String getCustNo(){
		return this.custNo;
	}
	public String getMobile(){
		return this.mobileNo;
	}
	public LocalDateTime getDate(){
		return this.date;
	}
}