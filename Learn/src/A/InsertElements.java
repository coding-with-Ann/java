package A;

public class InsertElements {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		// insert element at the beginning
		int k = 2;
		int arr1[] = new int[arr.length+2];
		for(int i=0; i<arr.length; i++) {
			arr1[i+1] = arr[i];
		}
		arr1[0] = k;                    //inserted at beginning of array
		
		//Insert element at the end
		int e = 6;
		arr1[arr.length+1] = e;           //Inserted element at end of array
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	
	}
}
