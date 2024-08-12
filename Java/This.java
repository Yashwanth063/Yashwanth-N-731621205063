package Pack1;

public class This {
	
	String name;
	This(String name){
		this(10, 20);
		this.name=name;
		this.greet();
	}
	This(int a,int b){
		System.out.println("Addition"+(a+b));
	}
	void greet() {
		System.out.println("Welcome"+name);
	}
	
public static void main(String []sh) {
	This th=new This("Yash");
}
}
