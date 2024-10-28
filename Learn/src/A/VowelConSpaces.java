//count no of vowels, consonants and spaces
package A;

import java.util.Scanner;

public class VowelConSpaces {
	public static void main(String[] args) {
		int vowels =0,consonants=0, whitespaces = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u'  ){
				vowels ++;
			}
				else if(ch>='a' && ch<='z'){
					
					consonants ++;
				}
				else if(ch ==' ') {
					
					whitespaces ++;
				}
				
			}
		System.out.println(+vowels);
		System.out.println(+consonants);
		System.out.println(+whitespaces);
		}
	}
