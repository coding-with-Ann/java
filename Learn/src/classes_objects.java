//Class is a blue print of an object. An object is an instance of the class.
//Every entity has attribute and behavior. 
//Similarly class has some attributes and which we called as properties and behaviors which we call as methods
//Every class knows something and does something.
class Calci{
//	
	int num1;
	int num2;
	int result;
	
	public void addition() {
		result = num1 + num2;
	}
	
}

public class classes_objects {
	
	public static void main(String[] args)
	{
		Calci obj = new Calci();  // object knows something and does something. obj is the reference variable.
		obj.num1 = 5;             // new Calci is the object.
		obj.num2 = 10;
		obj.addition();
		System.out.println(obj.result);
		
	}

}

class Stu{
	
	String name;
	int age;
	String address;
	String details;
	
	void who(String name , int age, String address){
		
		details = name +" " + age + " " + address;
	}
	
	
	public static void main(String[] args)
	{
		Stu obj = new Stu();
		obj.name = "A";
		obj.age = 1;
		obj.address = "England";
		obj.who("A", 1, "England" );
		System.out.println(obj.details);
		
	}
}
