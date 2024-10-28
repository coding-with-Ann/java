package A;
//Remove characters except letters
import java.util.Scanner;

public class RemoveCharacters {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 ="";
		for(int i=0; i<str.length(); i++) {
			int ascii = (int)(str.charAt(i));
			if((ascii>=65 && ascii<=90) || (ascii >= 97 && ascii<=122)){
				 str1 = str1+str.charAt(i);
			}
			else {
				continue;
			}
			
		}
		System.out.println(str1);
	}

}
