package A;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		
		int arr[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			
			 arr[i] = sc.nextInt();
		}
		for(int i = 0; i<T; i++) {
			
			for(int j = 1; j<=arr[i]; j++) {
				
				if(j%3 == 0 && j%5 == 0) {
					System.out.println("FizzBuzz");
				}
				
				else if(j%3 == 0) {
					System.out.println("Fizz");
				}
				
				else if(j%5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(+j);
				}
				
			}
			
		}
		
	}

}


