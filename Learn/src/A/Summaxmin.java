package A;

import java.util.Scanner;

public class Summaxmin {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = smaxmin(n, arr);
		System.out.println(sum);
		}
	
	static int smaxmin(int n, int arr[]){
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<n; i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		int sum = max + min;
		return sum;
	}
	
}
