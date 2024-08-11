import java.util.*;

class RandomNumber{
 
public static void main(String []ay){

Random rm=new Random();

//setting range

int r1=rm.nextInt(100);
int r2=rm.nextInt(50);

System.out.println(r1);
System.out.println(r2);


//using Math.random()


System.out.println(Math.random());
System.out.println(Math.random());
System.out.println(Math.random());
}
}