package Pack1;
import java.util.*;

class Student{
    Scanner sc=new Scanner(System.in);

	int reg_no;
	String stud_name;
	int arr[]=new int[5];
	
	int sum,avg;
	String grade;
	
	Student(int reg_no,String stud_name) {
		this.reg_no=reg_no;
		this.stud_name=stud_name;
	}
	
	void getMarks() {        
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();	
		
	}
	
	void calculateGrade() {
		sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/5;
		
		if(avg > 90)
			grade="A grade";
		else if(avg > 80)
			grade="B grade";
		else if(avg > 65)
			grade="C grade";
		else 
			grade="D grade";
			}
	
	
	void display() {
		System.out.println("the average is:"+avg);
		System.out.println("The sum is:"+sum);
		System.out.println("The Grade is"+grade);
	}
}
  

public class Calculation {
  public static void main(String []at) {
	Student st=new Student(63,"Yash");
	st.getMarks();
	st.calculateGrade();
	st.display();
}
}
