import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int turn = 0;
        for(int row_no =1 ; row_no <= n ; row_no++) {
            for(int col =1 ; col<= row_no ; col++) {
                if(turn == 0) {
                    System.out.print("*");
                    turn = 1;
                }
                else {
                    System.out.print("#");
                    turn = 0;
                }
     
            }
            System.out.print("\n");
        }
        in.close();
    }
}
