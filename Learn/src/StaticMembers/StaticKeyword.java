package StaticMembers;
//Static keywords are used with the those members belong to the class.
//We can make any member or any property of the class as static by putting a static keyword infront of it.
//Static member variables are also called class variables.
//If a variable in a class is both static and final then technically it becomes a constant.
//static final double PI = 3.14159265358 

//As an example in a student class you are storing the name of the college, 
//then the name of the college is unique for all students of the college. 
//Here static keyword can be used to make the college name same for all students.

//If you want to create a employ management system to maintain the employ ids from 1 to n
//the last employ object has the total employ count.
//Here each object has to know the state of the previous object.(or the number of previous employ.)
public class StaticKeyword {
	
	public static void main(String args[])
	{
		Student john = new Student("john","England",1); 
		System.out.println(john.getName());
		System.out.println(Student.college); // static way of accessing a member. college is accessed using class name.
		Student john2 = new Student("john","England",1); 
		//Even if multiple objects are created, the static block is executed only once.
	}

}
