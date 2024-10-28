package Polymorphism;
//You cannot use the concept of method overriding without using the concept of inheritance.
//If a super class defines a instance method and then the subclass again tries to define the
//instance method with the exact same signature then this phenomena is called method overriding. 
//Instance method is the normal method which you define in your classes.
//Static method belongs to the class but not the object.
//TO CALL STATIC METHOD USE CLASSNAME.METHOD and FOR NON STATIC METHOD USE OBJECTNAME.METHOD .
//If super class defines a static method sub class also defines the instance method it causes a compilation error.
//If super class has instance method and then sub class uses the same 
//signature but tries to use the static method then it causes compilation error.
//If super class defines a static method and the subclass also defines the same 
//method with exact signature then the super classes static method gets hidden.
public class Methodoverriding {    //consider as bicycle class.
	
	public static void main(String args[])
	{
//		Bicycle bicycle = new Bicycle(10,1);
//		bicycle.SpeedUp(10);
//		System.out.println("speed after increasing speed" +bicycle.speed);
//		bicycle.applyBreak(1);
//		System.out.println("speed after applying break" +bicycle.speed);
		
		Bicycle mountainbike = new MountainBike(50,50,3);
		System.out.println("mountainbike gear is " + mountainbike.gear);
		System.out.println("mountainbike speed is " + mountainbike.speed);
		
		mountainbike.applyBreak(1);
		System.out.println("speed after applying break" +mountainbike.speed);
		
		mountainbike.SpeedUp(10);
		System.out.println("speed after increasing speed" +mountainbike.speed);
		
		
		
	}
}