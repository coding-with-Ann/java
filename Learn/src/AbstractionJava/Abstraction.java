package AbstractionJava;

//Abstraction means hiding something.
//We show only relevant part to the user and hide internal details.
//abstract is a keyword which is used infront of a class or a method.
//If used before a class the whole class becomes abstract.
//Abstract classes cannot be instantiated(i.e cannot call constructor)but they can be subclassed.
//Abstract methods can be declared but cannot be implemented. 
public abstract class Abstraction {     // whole class is abstract so can't call constructor
	
	int x, y;        //These variables can be accessed by child class aswell.
	
	void moveTo(int newX, int newY)
	{
		System.out.println(+x +"and"+ +y);
		
	}
	
	abstract void draw();     //abstract methods can be declared but can't be defined.
	abstract void resize();
	//to use these implementations use extends keyword and create a child class.
	//In child class draw and resize can be implemented. 

	public static void main(String[] args)
	{
		Abstraction circle = new Circle();  // Here reference of the parent class and object is of the child class.
		circle.draw();
		circle.resize();
		
	}
	
}

