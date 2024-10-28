package DataTypes;

public class Datatype_conversion {
	
	public static void main(String[] args)
	{
		                       //Implict type conversion
		
		int a = 100;
		System.out.println(a);
		
		long l = a;
		System.out.println(l);
	
		float f = l;
		System.out.println(f);
		
		
		                        //Explicit type conversion
		
		double d = 50.3;
		System.out.println(d); 
		
		float f1 = (float)d;
		System.out.println(f1);
		
		long l1 = (long)f1;
		System.out.println(l1);
		
		int a1 = (int)l1;
		System.out.println(a1);
	}

}
      