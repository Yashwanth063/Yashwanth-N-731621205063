package Pack1;


class Animal{
	void makeSound(String dog){
		System.out.println("Dog Bark");
	}
}
class Cat extends Animal{
	void makeSound(String dog) {
		System.out.println("Cat sound");
	}
}
public class Animals {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.makeSound("Cat");
	}
}
