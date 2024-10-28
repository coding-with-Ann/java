package HackerEarth;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		int n = sc.nextInt();
		for(int i=0; i<str.length(); i++) {
			if(str.length() == n) {
				if(str.charAt(i) == 'a') {
					count +=1;
				}
			}
		}
		if(str.length()<n) {
			int i=0;
			str = str+str.charAt(i);
			i++;
		}
		
		
		
	}

}
