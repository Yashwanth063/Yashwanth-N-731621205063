package Pack1;


class Person{
	
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("The name is :"+name);
		System.out.println("The age is:"+age);
	}
}
class Parent {
public static void main(String []ag) {
	Person p=new Person("Yash",21);
	Person p2=new Person("Nithaj",20);
	p.display();
	p2.display();
}
}
