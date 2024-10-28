package StaticMembers;

//For static nested class

public class OuterClass {
	
	static int outerstaticmember = 10;
	int instancemember = 20;
	private static int outerprivatemember = 30;
	
	static class StaticNestedClass {
		
		void display()
		{
			System.out.println("outer static member is " +outerstaticmember);
			System.out.println("outer provate member is " +outerprivatemember);
			//System.out.println("instancemember value is" +instancemember);
			
			//instance member cannot be accessed in the static class.
		}
	}
}
	
