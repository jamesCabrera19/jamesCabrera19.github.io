
public class Student extends Person {

	// A student has a class status (freshman, sophomore, or senior). Define the status as a constant.
	private String status;
	
	public Student() {
		this.status = ""; 
	}
	public Student(String status) {
		this.status = status;
	}
}
