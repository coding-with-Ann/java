package DataTypes;

public class Nonprimitivedatatypes {
	
	public static void main(String[] args)
	{
		
		String str= "hello";  //string is somewhat non primitive data type
		System.out.println(str);
		String str1 = new String("hello");
		System.out.println(str1);
		
		int arr[];             //Arrays
		arr= new int[2];
		arr[0]=1;
		arr[1]=2;
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		
		
	}
}
