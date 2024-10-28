package A;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		String rev = "";
	
		for(int i=len-1; i>=0; i--) {
			
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
//		
//		String a = sc.nextLine();
//		String b = sc.nextLine();
//		if(a.equals(b)) {               // *****
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
		}
		
	}
