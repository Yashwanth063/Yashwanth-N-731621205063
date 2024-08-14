package Pack1;


class Shape{
	void getArea(int l,int b) {
		System.out.println(l*b);
	}
}

class Rectangle extends Shape{
	void getArea(int l,int b) {
		System.out.println(l+b);
	}
}

class Shapes {
public static void main(String[] args) {
	Rectangle rec=new Rectangle();
	rec.getArea(29, 2);
}
}
