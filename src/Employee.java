
public class Employee extends Person{

	// data fields
	private String office;
	private double salary;
	private String dateHired;
	
	
	// set and get methods
	public String getOffice() {
		return office;
	}
	
	public double getSalary() {
		return salary;
	}
	//
	public String getDateHired() {
		return dateHired;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;	
	}
	
	// no arg constructor
	public Employee() {
		this.office = "";
		this.salary = 0.0;
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
