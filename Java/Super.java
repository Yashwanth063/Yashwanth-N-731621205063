package Pack1;


class A{
	int a = 10;
	A(String name){
		System.out.println("Wlcome"+name);
	}
  void m1() {
	  System.out.println("Parent method");
  }
}
class B extends A{
	B(){
		super("yash");
	}
	void m2() {
		System.out.println("super variable:"+super.a);
		super.m1();
	}
}
public class Super {
 public static void main(String[] args) {
	B b=new B();
	b.m2();
	
	Class cc=a.getClass();
	String st=cc.getName();
	System.out.println(st);
}
}
