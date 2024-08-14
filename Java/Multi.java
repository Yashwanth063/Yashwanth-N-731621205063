package Pack1;
import java.util.*;

class Vechicle {
	void noOfEnginee() {
		System.out.println("have one engine");
	}
}

class TwoWheeler1 extends Vechicle{
	void noOfWheels() {
		System.out.println("Have two wheels");
	}
}

class Bike extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand is honda");
	}
}


public class Multi {
  public static void main(String[] args) {
	Bike bk=new Bike();
	bk.noOfWheels();
	bk.brandName();
	bk.noOfEnginee();
}
}
