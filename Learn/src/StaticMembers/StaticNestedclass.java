package StaticMembers;

//To define a class within another class nested classes are used.
//This is used for ENCAPSULATION.
//Nested classes are divided into two categories, 
//they are static nested classes and non static nested classes.
//Non static nested classes are called inner classes.
//If we use static keyword infront of a nested class then we call it as static nested class.
//If we don't put static keyword infront of a nested class then we call it as general inner class.
//USES OF NESTED CLASSES

//If you have a class which is serving the purpose of a larger class 
//then it is better to group those two classes inside a single class. Simply nest the smaller class inside the bigger class.
//It increases encapsulation. Like a inner kitchen class in a house class.



public class StaticNestedclass {
	public static void main(String args[])
	{
	
	OuterClass.StaticNestedClass nestedobject = new OuterClass.StaticNestedClass();
	//syntax for static nested classes.
	//Static members can be assessed using class name, so staticnestedclass obect is accessed using class name.
	
	nestedobject.display();
	
	}

}
