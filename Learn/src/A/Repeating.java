package A;

public class Repeating {
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,3,4,4,5,2};
		int n = arr.length;
		int dup[] = new int[n];
		int count = 0;
		for(int i=0; i<n-1; i++) {          //length-1 
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					dup[count++] = arr[i];
				}	
			}
		}
		for(int i=0; i<count; i++) {
			if(dup[i]!=dup[i+1]) {
				System.out.print(dup[i]+" ");
			}
			
		}
		
	}
}
