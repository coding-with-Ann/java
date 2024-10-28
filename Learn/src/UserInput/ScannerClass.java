package UserInput;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //System.in is used to take input from user.
		
			int i = sc.nextInt();  //nextInt is used to take integer input from user.
			
			System.out.println(+i);
			
			String str1 = sc.nextLine();  //nextLine takes input even after entering space
			
			System.out.println(str1);
			
			String str2 = sc.next(); //next ignores all the input string after space.
			
			System.out.println(str2);
			
			
			
			
		
		
	}

}
