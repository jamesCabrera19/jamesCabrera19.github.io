/**
 * Objective: 
 * Algorithm: Programming Exercise - week 2
 *Input and Output: Create a Faculty subclass of Employee
 * Created by: Jaime Cabrera
 * Date: June 11, 2025
 * Version: 1
 */

public class Faculty extends Employee {

	// data fields
	private String officeHours;
	private String rank;

	// set and get methods	
	
	// returns office hours string
	public String getOfficeHours() {
		return officeHours;
	}
	// returns rank string
	public String getRank() {
		return rank;
	}
	
	// set methods
	// sets office hours
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	// sets rank
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	// no arg constructor
	public Faculty() {
		this.officeHours = "";
		this.rank = "";
	}
	
	// arg constructor
	public Faculty(String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	// string method
	@Override
	public String toString() {
	    return "Class: Faculty, Name: " + getName();
	}
}
