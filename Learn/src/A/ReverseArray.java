package A;

public class ReverseArray {
	public static void main(String[] args) {
//		int arr[] = {5,4,3,2,1};
//	reverse(arr);
//	
//	}
//	static void reverse(int arr[]) {
//		int arr1[] = new int[arr.length];
//		int n = arr.length;
//		for(int i=n-1; i>=0; i--) {
//			arr1[n-1-i] = arr[i];     //*****
//		}
//		for(int i=0; i<arr.length; i++)
//		System.out.print(arr1[i]);
		
		
		
		int arr[] = {5,4,3,2,1};
		int temp;
		int n = arr.length;
		for(int i=0; i<n/2; i++) {     // n/2 times
			
			temp = arr[i];
			
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		
		}
		
		
	}
	

}
