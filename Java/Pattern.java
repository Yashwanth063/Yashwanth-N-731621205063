import java.util.*;

class Pattern {
 public static void main(String []ar){
  Scanner sc=new Scanner(System.in);

System.out.println("Enter the no of rows:");  
int row=sc.nextInt();
System.out.println("Enter the no of column:");
int col=sc.nextInt();

// logic for pattern

for(int i=0;i<row;i++){
System.out.println();
  for(int j=0;j<=i;j++){
     System.out.print("*" +" ");
}
}

}
}