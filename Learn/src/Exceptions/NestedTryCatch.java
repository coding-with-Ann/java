package Exceptions;

public class NestedTryCatch {
	
	public static void maina(String[] args ) {
		
		try { //block1
			
			try {
				//block2
				try {
					int arr[] = {1,2,3,4};
				}
				
				catch{
					System.out.println();
				}
			}
			
		}
	}

}
