package ClassObject;

public class Main {
	
	public static void main(String args[])
	{
		Student john = new Student("john", 2, "california");
		Student john1 = new Student("john1", 2, "california");
		
		Student john2 = new Student("john2", 3, "west california");
		
		System.out.println(john.equals(john1)); 
		
		//returns false if you don't override equals method because the two references are pointing to two different memory locations.
		//This brings you to the hash code contract. 
		//You need to override the hashcode contract as well along with equals to make sure that your equality runs perfectly.
		//The hashcode is your memory footprint. The hashcode of the object is calculated. The hash code of the object is calculated using the definition you provided in override.
		//Java will goto that memory footprint to see if an object there present or not.
		//There can be multiple objects stored at that memory location.
		//******For example if obj1, obj2 and obj3 are at same memory location then java will use the equlas method to compare the equality objects.
		//Here both hashcode and equals working together to point to the right object.
		////**********listen again.
		
		
	}

}
