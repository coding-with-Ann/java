package A;
import java.util.Arrays;

//Remove duplicates from sorted array

public class RemoveDuplicates {
	public static void main(String args[]) {
		int arr[] = {2,2,3,4,4,1,5};
		Arrays.sort(arr);
		int visited = -1;
		int arr1[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr1[j] = visited;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr1[i]!=visited) {
				System.out.print(arr[i]);
			}
		}
	}
}
