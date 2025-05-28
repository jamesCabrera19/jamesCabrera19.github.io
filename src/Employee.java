
public class Employee extends Person{

	//An employee has an office, salary, and state hired. You may hard code the date hired. 
	private String office;
	private double salary;
	private String dateHired;
	
	
	public String getOffice() {
		return office;
	}
	

	public double getSalary() {
		return salary;
	}
	

	public String getDateHired() {
		return dateHired;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	
	
	
	public Employee() {
		this.office = "";
		this.salary = 0.0;
		this.dateHired = "6/10/2020";
	}
	public Employee(String office, double salary, String dateHired) {
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
}
