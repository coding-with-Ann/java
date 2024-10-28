package AutoBoxingAndUnboxing;


//We can use this when we want to convert primitive data types to object wrapper classes and vice versa.
//Process of converting primitive data types to object wrapper class is called AutoBoxing.
//The process of converting object wrapper classes to primitive data types is called Auto unboxing.
public class AutoboxingDemo {
	
	
	public static void main(String args[]) {
		
		int i = 10;
		
		//AutoBox
		Integer iObj = Integer.valueOf(i);
		System.out.println("Value of integer object is "+ iObj);
		
		//Auto-unBox
		int i1 = iObj;
		System.out.println("value of i1 "+ i1);
		
		//AutoBox
		Character charObj = 'a';
		
		//or char x = 'a'; 
		//Character charObj = Character.valueOf(x);
		
		//Auto unbox
		char ch = charObj;
		System.out.println("The auto unbox of ch is "+ch);
		
		
	}

}
