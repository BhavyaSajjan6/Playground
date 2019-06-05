import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int p=n%10;
    int q=n/10;
    int r=q%10;
    int s=q/10;
    System.out.print(p);
    System.out.print(r);
    System.out.print(s);
    
        

    
  }
}