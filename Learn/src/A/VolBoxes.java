package A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolBoxes {
	public static void main(String[] args) {
		int s[][] = new int [20][20];
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		try{
			for(int i = 0; i<k; i++) {
				for(int j= 0; j<k; j++) {
					s[i][j] = sc.nextInt();
			}			
				}
				for(int i = 0; i<k; i++) {
					for(int j= 0; j<k; j++) {
						System.out.print(s[i][j]+" ");			
					}
					System.out.println("\n");
			}
			
		}catch(InputMismatchException e) {
			for(int i = 0; i<k; i++) {
				for(int j= 0; j<k; j++) {
					s[i][j] = sc.nextInt();
			}			
				}
				for(int i = 0; i<k; i++) {
					for(int j= 0; j<k; j++) {
						System.out.print(s[i][j]+" ");			
					}
					System.out.println("\n");
			}
			
		}
		}
		
	}
