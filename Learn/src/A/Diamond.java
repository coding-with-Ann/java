package A;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++){

			for(int j=0; j<n-i; j++) {

			System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++){
				char c = (char) (64+i);
				System.out.print(c);
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*n-(2*i+1)); k++) {
				char c= (char)(69+i);
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
