
public class StaffMember extends Employee {
	// single data field
	private String title;
	
	// set and get methods
	public String getTitle() {
		return title;
	}
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
