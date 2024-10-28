package A;

import java.util.Scanner;

public class twodArray {
	public static void main(String args[]) {
	    // initialize here.
	    int k, i, j;
	    int arr[][] = new int[10][10];
	    Scanner scan = new Scanner(System.in);

	    k = scan.nextInt();
	    
	    for (i = 0; i < k; i++) {
	      for (j = 0; j < k; j++) {
	        arr[i][j] = scan.nextInt();
	      }
	    }
	    
	    for (i = 0; i < k; i++) {
	      for (j = 0; j < k; j++) {
	        System.out.print(arr[i][j] + "  ");
	      }
	      System.out.println();
	    }
	  }

}
