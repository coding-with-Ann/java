package A;

//Rotate array by k elements

public class rotateArray {
	
//	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5};
//		int k = 2;
//		int n = arr.length;
//		int arr1[] = new int[arr.length];
//		for(int i=0; i<n; i++) {
//			arr1[i] = arr[(i+k) % n];              //n is length of nums
//			
//		}
//		for(int i=0; i<n; i++) {
//			System.out.print(arr1[i]);
//		}
//	
//	}
	
// USING SWAPING
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int temp;
		int k = 2;
		int n = arr.length;
		for(int i=0; i<n/2; i++) {
			
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
			
		}
		for(int i=0; i<k/2; i++) {
			temp = arr[i];
			arr[i] = arr[k-1-i];
			arr[k-1-i] = temp;
		}
		for(int i=k; i<=(n-1)/2; i++) {
			temp = arr[i];
			arr[i] = arr[n-1];     //Swapping only once from i = k
			arr[n-1] = temp;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		
		}
		
	}
}
