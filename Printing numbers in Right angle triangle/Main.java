import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int row = 1; row <= n; row++)
	    {   
            // Handle numbers for each row
	        for(int curr_col = 1; curr_col <=row; curr_col++)
	        {
	            System.out.print(row);
	        }
	        System.out.println();
	    }
	}
}
