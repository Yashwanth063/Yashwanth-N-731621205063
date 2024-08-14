package Pack1;


class Dog{
	
	private String name;
	private String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	
 public String getName(){
	 return name;
 }
 
 public void setName(String nm) {
	 this.name=nm;
 }
 
 public String getBreed() {
	 return breed;
 }
 
 public void setBreed(String br) {
	 this.breed=br;
 }
 
 
	void display() {
		System.out.println("The name is :"+name);
		System.out.println("The breed is:"+breed);
	}
}
class Animal {
public static void main(String []ag) {
	
	System.out.println("Initial display...");
	
	Dog p=new Dog("Tommy","Siberian Husky");
	Dog p2=new Dog("arthur","Golden retriver");
	
	p.setName("Legend");
	p.setBreed("Naatu");
	
	p.display();
	p2.display();
	
}
}
