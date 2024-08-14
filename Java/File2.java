import java.util.*;

class File2{
public static void main(String []ar){
int eid;
String ename;
float esalary;

Scanner sc=new Scanner(System.in);

System.out.println("enter the eid:");
eid=sc.nextInt();
System.out.println("enter the ename:");
ename=sc.next();
System.out.println("enter the esalary:");
esalary=sc.nextFloat();

System.out.println("emp id:"+eid);
System.out.println("emp name:"+ename);
System.out.println("e salary:"+esalary);
}
}
