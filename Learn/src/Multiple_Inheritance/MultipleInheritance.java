package Multiple_Inheritance;

//Multiple inheritance using interfaces.
//Multiple inheritance is not possible in java. 
//If class c is extending from class A, class B and class A class B are extending from super class. 
//then if class c wants to access something from super class which route should it take class A or class B. 
//This creates a confusion called diamond problem.
//This can be solved using interfaces.
public class MultipleInheritance {
	
	public static void main(String[] args) {
		
		MountainBike multipleinheritance = new MountainBike(10,1,2);
		
		System.out.println(multipleinheritance.speedUp(10));
		
		System.out.println(multipleinheritance.applyBreak(1));
		multipleinheritance.canRotateTwoWheeler();
		
	}

}
