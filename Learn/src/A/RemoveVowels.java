package A;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
//					str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
//				str = str.substring(0,i) + str.substring(i+1);
//				i--;
//						
//			}
//		}
//		System.out.println(str);
		
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
					str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
					continue;
			}
			else {
				str1 = str1+str.charAt(i);;
			}
		}
		System.out.println(str1);
	}

}
