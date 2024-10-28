package A;

import java.util.Scanner;

public class demo {
	    public static void main(String args[]){

	        int n;
	        int a[] = new int[50];
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	        for(int i = 0; i<n; i++){
	            a[i]=s.nextInt();
	        }
	        for(int j=0; j<n/2;j++){
	            a[j] = a[j]*2;
	             System.out.print(a[j]+" ");
	        }
	        for(int j=n/2; j<n; j++){
	            a[j] = a[j]*3;
	            System.out.print(a[j]+" ");
	        }
	        
	    }
	}