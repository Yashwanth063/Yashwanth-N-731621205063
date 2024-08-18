package Pack1;

class Employee{
	int salary=20000;
	void calculateSalary() {
		System.out.println("Calculate");
	}
}

class Manager extends Employee{
	void calculateSalary() {
		salary+=10000;
		System.out.println("manager salary"+salary);
	}
}

class Programmer extends Employee{
	void calculateSalary() {
		salary+=5000;
		System.out.println("Programmer salary"+salary);
	}
}
public class EmpL4 {
public static void main(String[] args) {
	Employee emp;
	emp=new Programmer();
	emp.calculateSalary();
	
	emp=new Manager();
	emp.calculateSalary();
}
}
