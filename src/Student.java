
public class Student extends Person {


	// data fields
	public static final String FRESHMAN = "Freshman";
	public static final String SPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	private String status;
	
	// set and get methods
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status; 
	}
	
	// no arg constructor method
	public Student() {
		this.status = FRESHMAN; // default
	}
	// arg constructor
	public Student(String status) {
		this.status = status;
	}
	// string method
	@Override
	public String toString() {
	    return "Class: Student, Name: " + getName(); 
	}
}
