/**
 * Objective: 
 * Algorithm: Programming Exercise - week 2
 *Input and Output: Create a Person Object class
 * Created by: Jaime Cabrera
 * Date: June 11, 2025
 * Version: 1
 */


public class Person {
	// data fields
	private String name;
	private String address;
	private int phoneNumber;
	private String email;
	
	// get methods
	// returns the name of the person
	public String getName() {
		return name;
	}
	// returns the address of the person
	public String getAddress() {
		return address;
	}
	// return the phone number in Int format
	public int getPhoneNumber() {
		return phoneNumber;
	}
	// returns the email of the person
	public String getEmail() {
		return email;
	}
	
	// set methods
	// sets a new name
	public void setName(String newName) {
		this.name = newName;
	}
	// sets a new address
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	// sets new phone number
	public void setPhoneNumber(int newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}
	// sets a new email
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
	// to string method - returns the name of the person by calling the method getName()
	@Override
	public String toString() {
	    return "Class: Person, Name: " + getName();
	}
	

}
