import java.util.*;
import java.lang.*;

class Main{

 void print(){
 System.out.println("print method");
}
}

class ObjectCreation extends Main{
 public static void main(String []at){
Main main=new Main();
  main.print();
}
}
