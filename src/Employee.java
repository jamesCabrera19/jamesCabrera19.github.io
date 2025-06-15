/**
 * Objective: 
 * Algorithm: Programming Exercise - week 2
 *Input and Output: Create a Employee subclass of Person
 * Created by: Jaime Cabrera
 * Date: June 11, 2025
 * Version: 1
 */


public class Employee extends Person{

	// data fields
	private String office;
	private double salary;
	private String dateHired;
	
	
	// set and get methods
	public String getOffice() {
		return office;
	}
	// returns salary
	public double getSalary() {
		return salary;
	}
	// returns date hired
	public String getDateHired() {
		return dateHired;
	}
	// set methods
	public void setOffice(String office) {
		this.office = office;
	}
	// sets the salary
	public void setSalary(double salary) {
		this.salary = salary;	
	}
	
	// no arg constructor
	public Employee() {
		this.office = ""; // empty string data field
		this.salary = 0.0; // 0 salary
		this.dateHired = "6/10/2020";
	}
	// arg constructor
	public Employee(String office, double salary, String dateHired) {
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	// string method
	@Override
	public String toString() {
	    return "Class: Employee, Name: " + getName();
	}
	
}
