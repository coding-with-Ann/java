package StaticMembers;

public class Student {
	
	static {          //static block can be executed only once.
		
		System.out.println("code intitializer");
		
					//This is a static block of code. 
				   //Only static member variables can be assessed here.
		
		int age2 = 2;
		System.out.println(age2);
	}
	
	String name;
	String address;
	int age;
	static String college = "XYZ";
	
	public Student (String name, String address, int age) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	

}
