import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
	Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int length = String.valueOf(num).length();
      int x;
        int n=num;
       int temp=n,sum=0,r;
        while(temp!=0)
        {
          r=temp%10;
          sum=sum+(int)Math.pow(r,length);
          temp=temp/10;
        }
      if(sum==n)
      {
      System.out.println("Armstrong Number");
        }
      else 
      {
      System.out.println("Not a Armstrong Number");
      }
    }
}