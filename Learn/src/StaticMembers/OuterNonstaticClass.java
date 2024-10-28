package StaticMembers;

//Inner class is also called non static nested class.

public class OuterNonstaticClass {
	
	public class InnerNonstaticClass{
	
	void display()
	{
		System.out.println("This is a inner class");
	}
	
	}
	
	
	//METHOD LOCAL INNER CLASS

	void outerClassMethod()       //method
	{
		System.out.println("In the outer class method");
		
		class MethodLocalClass{  //This class is inside a method, we call it as method local inner class.
			
			void localInnerClassMethod()
			{
				System.out.println("In the method local class: method");
		    }
	}
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerClassMethod();
}
	
}
