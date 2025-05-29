
public class Faculty extends Employee {

	// data fields
	private String officeHours;
	private String rank;

	// set and get methods	
	public String getOfficeHours() {
		return officeHours;
	}
	public String getRank() {
		return rank;
	}
	//
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
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
