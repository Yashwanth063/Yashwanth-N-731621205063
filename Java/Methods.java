package Pack1;

public class Methods {
	void  method1() {
		System.out.println("Instance method");
	}
	static void method2() {
		System.out.println("Static method");
	}
	public static void main(String []ah) {
		Methods mt=new Methods();
		mt.method1();
		Methods.method2();
	}
}
