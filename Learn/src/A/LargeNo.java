package A;

import java.util.*;

public class LargeNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(sort(arr));
	}
		static int sort(int arr[]) {
			Arrays.sort(arr);
			return arr[arr.length-1];
		}
}