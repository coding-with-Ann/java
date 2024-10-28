package StaticMembers;

//Inner class is also called non static nested class.

public class InnerClass {
	
	public static void main(String args[])
	{
//		OuterNonstaticClass.InnerNonstaticClass inner = new OuterNonstaticClass().new InnerNonstaticClass();
		//syntax for inner classes.
		//object  of outernonstaticclass is used to create object of innernonstaticclass.
		
//		inner.display();
		
		OuterNonstaticClass outerclass = new OuterNonstaticClass();
		outerclass.outerClassMethod();
		
		
	}
	
	
}
