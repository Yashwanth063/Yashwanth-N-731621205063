package Pack1;

class Employee{
	int empid;
	String empname;
	float empsalary;
	
	Employee(int empid,String empname,float empsalary){
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
	}
	void display() {
		System.out.println("Emp id:"+empid);
		System.out.println("Emp name:"+empname);
		System.out.println("Emp salary:"+empsalary);
	}
}
public class Day2 {
	 public static void main(String ao[]) {
		 Employee emp1=new Employee(10,"Yash",300.82f);
		 emp1.display();
	 }

}
