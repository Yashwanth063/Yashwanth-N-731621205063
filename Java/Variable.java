package Pack1;

public class Variable {
	int b=20;
	static int c=30;
public static void main(String ar[]) {
	int a=10;
	System.out.println("Local variable:"+a);
	
	Variable v=new Variable();
	System.out.println(v.b);
	
	System.out.println(Variable.c);
}
}
