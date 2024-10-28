package A;

import java.util.*;

public class S2L2 {
	// Second smallest and the second largest number in an array
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		sort(arr);
	}
	static void sort(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-2]);
		
		
	}


}
