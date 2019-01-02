public class Address{
	private int streetNo;
	private String city;
	private String state;
	public int getStreetNo(){
		return this.streetNo;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public void setStreetNo(int streetNo){
		this.streetNo=streetNo;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.state=state;
	}
	public String toString()
	{
		return "\nStreet Number: "+streetNo+"\nCity: "+city+"\nState: "+state;
	}
	public Address(){
	}
	public Address(int streetNo,String city,String state){
		this.streetNo=streetNo;
		this.city=city;
		this.state=state;
	}
}