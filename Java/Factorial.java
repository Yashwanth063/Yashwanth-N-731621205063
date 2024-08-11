import java.util.*;

class Factorial {
public static void main(String ar[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=sc.nextInt();
 
// logic
int fact=1;

if(num <= 0){
 System.out.println("The entered number is Invalid!");	
}
else{

for(int i=1;i<=num;i++){
	fact=fact*i;
}
System.out.println(fact);
}

}
}