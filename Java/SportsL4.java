package Pack1;

class Sports{
	void play() {
		System.out.println("Play");
	}
}

class BasketBall extends Sports{
	void play() {
		System.out.println("Playing Basket");
	}
}

class Rugby extends Sports{
	void play() {
		System.out.println("Playing rugby");
	}
}

class Football extends Sports{
	void play() {
		System.out.println("playing Football");
	}
}




public class SportsL4 {
public static void main(String[] args) {
	Sports sp;
	sp=new BasketBall();
	sp.play();
	
	sp=new Football();
	sp.play();
	
	sp=new Rugby();
	sp.play();
}
}
