package Pack1;

import java.util.*;
public class Rectangle {
 public static void main(String []hs) {
	 
	 Scanner sc=new Scanner(System.in);
	 int width = sc.nextInt();
	 int height = sc.nextInt();
	 
	 int area = width * height;
	 int perimeter = 2 * (width + height);
	 
	 System.out.println(area);
	 System.out.println(perimeter);
	 
 }
}
