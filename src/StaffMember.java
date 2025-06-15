/**
 * Objective: 
 * Algorithm: Programming Exercise - week 2
 *Input and Output: Create a Staff subclass of Employee
 * Created by: Jaime Cabrera
 * Date: June 11, 2025
 * Version: 1
 */

public class StaffMember extends Employee {
	// single data field
	private String title;
	
	// set and get methods
	// gets the title of the employee
	public String getTitle() {
		return title;
	}
	// sets the title of the employee
	public void setTitle(String title) {
		this.title = title;
	}
	
	// no arg constructor
	public StaffMember() {
		this.title = "";
	}
	// arg constructor 
	public StaffMember(String title) {
		this.title = title;
	}
	
	// to string method
	@Override
	public String toString() {
	    return "Class: StaffMember, Name: " + getName();
	}
	
	
}
