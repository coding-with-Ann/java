package A;

//To find median first sort array.

public class Median {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};               //Already sorted
		int n = arr.length;
		if(n%2 == 0) {
			int m1 = (n/2)-1;
		int m2 = n/2;
		int median = (m1 + m2)/2;
		System.out.println(median);
		}
		else {
			int median = (n/2)-1;
			System.out.println(median);
		}
		
		
		
		
	}
	

}
