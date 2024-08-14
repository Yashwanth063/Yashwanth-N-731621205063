package Pack1;

class Employee{
	void work() {
		System.out.println("Emp working");
	}
	
	void getSalary() {
		System.out.println("Emp salary");
	}
}

class HRManager extends Employee{
	void work() {
		System.out.println("HR works");
	}
	
	void addEmployee() {
		System.out.println("Employee added");
	}
}
public class Emp3 {
public static void main(String[] args) {
	HRManager hr=new HRManager();
	hr.work();
	hr.addEmployee();
	hr.getSalary();
	
	
}
}
