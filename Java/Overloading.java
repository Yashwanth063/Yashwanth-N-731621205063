package Pack1;

public class Overloading {
	
	void display(int a,int b) {
		System.out.println("Integer:"+(a+b));
	}
	void display(float a,float b) {
		System.out.println("Float:"+(a+b));
	}
	
	void display(String name) {
		System.out.println("String:"+name);
	}
  public static void main(String[] au) {
	  Overloading ol=new Overloading();
	  ol.display(10.3f, 22.9f);
	  ol.display(10, 39);
	  ol.display("Yash");
  }
}
