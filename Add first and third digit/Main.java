import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int p=n1/100;
      int q=n1%10;
      int sum=p+q;
      System.out.println(sum);
	}
}