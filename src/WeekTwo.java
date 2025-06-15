
/**
 * Objective: 
 * Algorithm: Programming Exercise - week 2
 *Input and Output: Create a Person Object with subclasses student, employee and subclasses faculty and staff
 * Created by: Jaime Cabrera
 * Date: June 11, 2025
 * Version: 1, files: [Person.java, Student.java, Employee.java, Faculty.java, StaffMember.java, WeekTwo.java]
 */

import java.util.Random;
public class WeekTwo {

	// method to create Person
    public static void getPerson() {
    	////////////// TESTING //////////////
        System.out.println("=== PERSON INFO ===");
        
        Person person = new Person("Jaime","123 Main St", 1234567890,"jaime@example.com" );
   
        System.out.println(person);
        System.out.println("Address: " + person.getAddress());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Phone: " + person.getPhoneNumber());
        System.out.println();
        return;
    }

    // method to create Student
    public static void getStudentInfo() {
    	////////////// TESTING //////////////
        System.out.println("=== STUDENT INFO ===");
        Student student = new Student(Student.JUNIOR);
        // setting the name
        student.setName("James");
        System.out.println(student);
        System.out.println("Status: " + student.getStatus());
        System.out.println();
        return;
    }
    
    // method to create Employee
    public static void getEmployeeInfo() {
    	////////////// TESTING //////////////
        System.out.println("=== EMPLOYEE INFO ===");
        // initiating random to make up salary amount
        Random random = new Random();
        int salary = random.nextInt(55000, 100000);

        Employee employee = new Employee("Room 101", salary, "5/10/2019");
        employee.setName("James Torres");

        // printing employee data
        System.out.println(employee);
        System.out.println("Hired Date: " + employee.getDateHired());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Office: " + employee.getOffice());
        System.out.println();
        
        return;
    }

    // method to create Faculty
    public static void getFacultyInfo() {
        System.out.println("=== FACULTY INFO ===");
        // initiating random to make up salary amount
        Random random = new Random();
        // salary for a PHD person should be high =)
        int salary = random.nextInt(89000, 200000);

        // faculty info
        Faculty faculty = new Faculty("MWF 10–12", "Professor");
        faculty.setName("Dr. Jaime Cabrera");
        faculty.setSalary(salary);
        faculty.setOffice("Room 105");

        // printing faculty data
        System.out.println(faculty);
        System.out.println("Hired Date: " + faculty.getDateHired());
        System.out.println("Salary: $" + faculty.getSalary());
        System.out.println("Office: " + faculty.getOffice());
        System.out.println("Office Hours: " + faculty.getOfficeHours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();
        
        return;
    }

    // method to create Staff
    public static void getStaffInfo() {
        System.out.println("=== STAFF INFO ===");
        Random random = new Random();
        // initiating random to make up salary amount
        int salary = random.nextInt(50000, 90000);
        
        // creating staff info
        StaffMember staff = new StaffMember("Lab Technician");
        staff.setName("Emma C");
        staff.setOffice("Room 102");
        staff.setSalary(salary);

        // printing staff data
        System.out.println(staff);
        System.out.println("Hired Date: " + staff.getDateHired());
        System.out.println("Salary: $" + staff.getSalary());
        System.out.println("Office: " + staff.getOffice());
        System.out.println("Title: " + staff.getTitle());
        System.out.println();
        
        return;
    }

    public static void main(String[] args) {
    	////////////// TESTING //////////////

    	// printing all methods, Person, Student, Employee, Faculty, Staff
    	// all methods return void - methods only create and print info
    
        getPerson();
        getStudentInfo();
        getEmployeeInfo();
        getFacultyInfo();
        getStaffInfo();
    }
}
