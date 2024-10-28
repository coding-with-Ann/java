package A;

import java.util.Scanner;

public class RemoveBrackets {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!='(' && str.charAt(i) != ')') {
				str1 = str + str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
