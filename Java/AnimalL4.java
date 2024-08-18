package Pack1;


class Animal{
	 void sound() {
		System.out.println("Animal malkes sound");
	}
}

class Bird extends Animal{
	void sound() {
		System.out.println("Bird sound");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("cat meow");
	}
}
public class AnimalL4 {
 public static void main(String[] args) {
	Animal an;
	an=new Bird();
	an.sound();
	
	an=new Cat();
	an.sound();
}
}
