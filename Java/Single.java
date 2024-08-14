package Pack1;
import java.util.*;

class TwoWheeler{
	void noOfWheels() {
		System.out.println("Have two wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand is honda");
	}
}


public class Single {
  public static void main(String[] args) {
	Bike bk=new Bike();
	bk.noOfWheels();
	bk.brandName();
}
}
