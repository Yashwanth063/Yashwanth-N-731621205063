package Pack1;

public class ConstOverloading {
	
	ConstOverloading(int a,int b) {
		this("yash");
		System.out.println("Integer:"+(a+b));
	}
	ConstOverloading(float a,float b) {
		System.out.println("Float:"+(a+b));
	}
	
	ConstOverloading(String name) {
		this(54.9f,64.7f);
		System.out.println("String:"+name);
	}
  public static void main(String[] au) {
	  ConstOverloading ol2=new ConstOverloading(10,20);
	  
  }
}
