import java.util.Scanner;
class Main{  
 public static void main(String args[]){  
  int i,fact=1;  
  int n;
   //It is the number to calculate factorial    
  Scanner in=new Scanner(System.in);
   n=in.nextInt();
   for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 }  
}  