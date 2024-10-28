package A;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		int c;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		c = a;
		a = b;
		b = c;
		System.out.println(+a + " " +b);
	
	}
	
	
	

}
