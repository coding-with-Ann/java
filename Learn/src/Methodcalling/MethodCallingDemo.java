package Methodcalling;
//If you want to calculate interest and the interest calculation logic is required
//at multiple locations then just reuse the method of interest calculation.


public class MethodCallingDemo {
	
	public static void main(String args[])
	{
		int i = 1;
		int result = changeValue(i);
		System.out.println("Value of i is " +result);
	}//THIS IS THE CONCEPT OF PASS BY VALUE
	//THERE IS NO CONCEPT OF PASS BY REFERENCE WHEN WE TALK ABOUT METHOD CALLING IN JAVA.
	
	private static int changeValue(int i)
	{
		i = i+1;
		return i;
	}

}

//////INCOMPLETE 9:04
