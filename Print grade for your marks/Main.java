import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int mark = sc.nextInt();
		
		
		if(mark >= 85)
		{
		    System.out.print("A");
		}
		else if(mark >= 75)
		{
		    System.out.print("B");
		}
		else if(mark >= 65)
		{
		    System.out.print("C");
		}
		else if(mark >= 55)
		{
		    System.out.print("D");
		}
		else if(mark >= 45)
		{
		    System.out.print("E");
		}
		else{
		    System.out.print("Fail");
		}
    }
}