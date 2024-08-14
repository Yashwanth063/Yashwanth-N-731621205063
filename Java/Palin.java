import java.util.*;
import java.lang.*;

class Palin{
 public static void main(String []ag){
Scanner sc=new Scanner(System.in);

String s1=sc.next();
StringBuffer sb=new StringBuffer(s1);
 StringBuffer sb2=sb.reverse();


String s2= sb2.toString();
if(s1 .equals(s2) ){
 	System.out.println("Palindrome");
}
else{
 System.out.println("Not Palindrome");
}

}
}