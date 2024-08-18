package Pack1;

import java.lang.*;
import java.util.*;

class Shape {
     double getArea();
     double getPerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle2 extends Shape {
    private double length;
    private double width;

    Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }
}

  

public class Shape2L4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

    }
}