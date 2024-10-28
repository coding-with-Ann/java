package Arrays.java;
//Array is a container object that holds fixed no of elements of similar data type.
//Arrays are the collection of elements of similar data type stored in contiguous memory location.

public class Arrays {
	
	public static void main(String[ ] args) {
		
		//1-D array
		
//		int arr[];        
//		arr = new int[4]; //int arr[] = new int[4];
//		arr[0] = 100;
//		arr[1] = 200;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		//2-D array
//		
//		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(arr1[i][j]);
//			}
//		      System.out.println();
//	}
//		
		//3-D array
		
		int arr2[][][] = {{{1,2,3},{4,5,6}},{{7,8,9},{4,5,6}}};
		System.out.println( arr2[0][1][2] );
		for(int i=0;i<2;i++) 
		{
			
			for(int j=0;j<1;j++)
			{
				for(int k=0;k<2;k++)
				{
					System.out.print(arr2[i][j][k]);
				}
            }
         }
	}
}
