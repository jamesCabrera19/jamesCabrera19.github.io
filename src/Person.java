
public class Person {
	// data fields
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	
	// get and set methods
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public void setPhoneNumber(int newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	
	// no arg constructor
	public Person() {
		this.name = "";
		this.address = "";
		this.phoneNumber = 0;
		this.email= "";
	}
	// constructor
	public Person(String name, String address,int phoneNumber, String email ) {
		this.name = name;
	    this.address = address;
	    this.phoneNumber = phoneNumber;
	    this.email = email;
		
	}
	// to string method
	@Override
	public String toString() {
	    return "Class: Person, Name: " + getName();
	}
	

}
