package A;

public class NonRepeating {
	public static void main(String[] args) {
		
		int arr[] = {1,3,2,1,2,4};
		int non[] = new int[arr.length];
		int count = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j && arr[i] == arr[j]) {
					break;
				}
				else {
					non[count++] =-1;
				}
				
			}
		}
		for(int i=0; i<count; i++) {
			if(non[i] == -1) {
				System.out.println(arr[i]);
			}
		}
	}

}
