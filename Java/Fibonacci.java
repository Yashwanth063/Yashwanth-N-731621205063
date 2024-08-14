import java.util.*;

class Fibonacci{
 public static void main(String []ag){
Scanner sc=new Scanner(System.in);

int n1=0;
int n2=1;
int n3;
int count = sc.nextInt();



System.out.println(0);
System.out.println(1);

for(int i=2;i<=count;i++){

n3=n2+n1;

System.out.println(n3);

n1=n2;
n2=n3;

}

}
}