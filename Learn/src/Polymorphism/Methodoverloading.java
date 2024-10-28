package Polymorphism;
//A particular entity(class,method,object) can take multiple forms.
//If any entity exhibits that kind of behavior then we say Polymorphism is in action.
//In method overloading the method remains same but the return type of the method may change.
//Using method overloading you can vary the no of arguments and the type of arguments.
public class Methodoverloading {
	
	public int multiply(int x, int y) {      //multiply method is being overloaded.
		
		return (x*y);
	}
	
	public int multiply(int x, int y, int z)
	{
		return x*y*z;
	}
	
	public double multiply(double x, double y)
	{
		return x*y;
	}

	
	public static void main(String[] args)
	{
		Methodoverloading methodoverloading = new Methodoverloading();
		System.out.println(methodoverloading.multiply(10,20));
		System.out.println(methodoverloading.multiply(10,20,30));
		System.out.println(methodoverloading.multiply(10.5,20.5));
	}
}
