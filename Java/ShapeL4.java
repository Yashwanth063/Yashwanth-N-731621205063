package Pack1;

class Shape{
	int l=10;
	int b=63;
	double r=37.244;
	void calculateArea() {
		System.out.println("Calculate");
	}
}

class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of circle is:"+Math.PI*r*r);
	}
}

class Triangle extends Shape{
	void calculateArea() {
		System.out.println("area of triangle:"+1/2*(l*b));
	}
}

class Rectangle extends Shape{
	void calculateArea() {
		System.out.println("area of rect is:"+l*b);
	}
}
public class ShapeL4 {
public static void main(String[] args) {
	Shape sp;
   sp=new Triangle();
   sp.calculateArea();
   
   sp=new Rectangle();
   sp.calculateArea();
   
   sp=new Circle();
   sp.calculateArea();
}
}
