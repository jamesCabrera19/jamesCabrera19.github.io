import java.util.Random;

public class WeekTwo {

    public static void getPerson() {
        System.out.println("=== PERSON INFO ===");
        Person person = new Person();
        person.setName("Jaime Cabrera");
        person.setAddress("123 Main St");
        person.setPhoneNumber(1234567890);
        person.setEmail("jaime@example.com");

        System.out.println(person);
        System.out.println("Address: " + person.getAddress());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Phone: " + person.getPhoneNumber());
        System.out.println();
    }

    public static void getStudentInfo() {
        System.out.println("=== STUDENT INFO ===");
        Student student = new Student(Student.JUNIOR);
        student.setName("James");

        System.out.println(student);
        System.out.println("Status: " + student.getStatus());
        System.out.println();
    }

    public static void getEmployeeInfo() {
        System.out.println("=== EMPLOYEE INFO ===");
        Random random = new Random();
        int salary = random.nextInt(55000, 100000);

        Employee employee = new Employee("Room 101", salary, "5/10/2019");
        employee.setName("James Torres");

        System.out.println(employee);
        System.out.println("Hired Date: " + employee.getDateHired());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Office: " + employee.getOffice());
        System.out.println();
    }

    public static void getFacultyInfo() {
        System.out.println("=== FACULTY INFO ===");
        Random random = new Random();
        int salary = random.nextInt(89000, 200000);

        Faculty faculty = new Faculty("MWF 10–12", "Professor");
        faculty.setName("Dr. Jaime Cabrera");
        faculty.setSalary(salary);
        faculty.setOffice("Room 105");

        System.out.println(faculty);
        System.out.println("Hired Date: " + faculty.getDateHired());
        System.out.println("Salary: $" + faculty.getSalary());
        System.out.println("Office: " + faculty.getOffice());
        System.out.println("Office Hours: " + faculty.getOfficeHours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();
    }

    public static void getStaffInfo() {
        System.out.println("=== STAFF INFO ===");
        Random random = new Random();
        int salary = random.nextInt(50000, 90000);
        StaffMember staff = new StaffMember("Lab Technician");
        staff.setName("Emma C");
        staff.setOffice("Room 102");
        staff.setSalary(salary);

        System.out.println(staff);
        System.out.println("Hired Date: " + staff.getDateHired());
        System.out.println("Salary: $" + staff.getSalary());
        System.out.println("Office: " + staff.getOffice());
        System.out.println("Title: " + staff.getTitle());
        System.out.println();
    }

    public static void main(String[] args) {
        getPerson();
        getStudentInfo();
        getEmployeeInfo();
        getFacultyInfo();
        getStaffInfo();
    }
}
