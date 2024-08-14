package Pack1;


class Vechicle{
	void drive() {
		System.out.println("Driving car");
	}
}

class Car extends Vechicle{
	void drive() {
		System.out.println("Repairing car");
	}
}
public class Vechicles { 
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
	}
}
