package A;

import java.util.Scanner;

public class RemoveSpaces {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== ' ') {
				continue;
			}
			else {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);
		
	}

}
