public class Address{
	private String city;
	private int pincode;
	
	public Address(){
		
	}
	
	public void setCity(String city){
		this.city=city;
	}
	
	public void setPinCode(int pincode){
		this.pincode = pincode;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public int getPinCode(){
		return this.pincode;
	}
	
	public Address(String city, int pincode){
		this.city =city;
		this.pincode=pincode;
	}
	
	public String toString(){
		return "Address[city="+city+", pincode="+pincode+"]";
	}
}