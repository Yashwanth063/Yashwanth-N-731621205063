package Pack1;


class Vechicle {
	int speed=10;
	void speedUp() {
		System.out.println("Default speed"+speed);
	}
}

class Car extends Vechicle{
	void speedUp() {
		speed +=100;
		System.out.println("Car speed"+speed);
	}
}

class Bicycle extends Vechicle{
	void speedUp() {
		speed+=22;
		System.out.println("Bicycle:"+speed);
	}
}
public class VechL4 {
public static void main(String[] args) {
	Vechicle ce;
	ce=new Car();
	ce.speedUp();
	
	ce=new Bicycle();
	ce.speedUp();
}
}
