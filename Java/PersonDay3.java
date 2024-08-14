package Pack1;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee12 extends Person {
    private String jobTitle;
    private String employeeId;

    public Employee12(String firstName, String lastName, String jobTitle, String employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

public class PersonDay3 {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person's First Name: " + person.getFirstName());
        System.out.println("Person's Last Name: " + person.getLastName());

        Employee12 employee = new Employee12("Jane", "Smith", "Manager", "EMP12345");
        System.out.println("Employee's First Name: " + employee.getFirstName());
        System.out.println("Employee's Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
