package A;

import java.util.Scanner;

public class TotalVechiles {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int W = sc.nextInt();
		
		int X = (W-2*V)/2;  
		int Y = V-X;
		
		System.out.println("no of two wheelers "+X +" " +"no of four wheelers "+Y);
		
	}

}










