import java.util.*;

public class Array{
 public static void main(String []ag){
Scanner sc=new Scanner(System.in);
int size =sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++){
  sum+=arr[i];
}
System.out.println("the sum is"+sum);
}
}