package Pack1;

import java.util.*;

abstract class Animal {
    abstract void move();
    abstract void makeSound();
}

class Bird extends Animal {
    void move() {
        System.out.println("Bird flies");
    }

    @Override
    void makeSound() {
        System.out.println("Chirp chirp");
    }
}

class Panthera extends Animal {
    void move() {
        System.out.println("Panthera walks and runs");
    }

    void makeSound() {
        System.out.println("Roar!");
    }
}

public class Animal3L4 {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panther = new Panthera();

        bird.move();
        bird.makeSound();

        panther.move();
        panther.makeSound();
    }
}
