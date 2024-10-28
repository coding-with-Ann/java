package A;

//Insert a given element at given index
public class InsertAtIndex {
	
	public static void insertAtpos(int arr[], int pos, int val, int n) {
		for(int i=n; i>=pos; i--) {
			  arr[i] = arr[i-1];
		}
		arr[pos-1] = val;
	}

	public static void main(String[] args) {
		int arr[]={1,2,4,5,6,7,8,9,0};
		int pos = 3;
		int val = 3;
		int n = 8;
		insertAtpos(arr,pos,val,n);
		for(int i =0; i<=n; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	
}
