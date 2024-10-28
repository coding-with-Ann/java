package comparable;
import java.util.ArrayList;
import java.util.Collections;
	//The requirement of comparable comes when you want to sort your collections.
	//collections.sort(i) is used to sort collections. Here i can be list or any other collection.
	//Here the elements are sorted based on the natural sorting order. This holds true for built-in data types.
	//What if the list is of type student object,java doesn't know how to sort student object. It knows how to sort basic data types.
	//Student is a custom type so java doesnt know how to sort student.
	//To solve this java provides an interface called comparable.
	//Comparable is used to sort objects of your class type.
	//public int compareTo(T O);. T and O are foreign and current objects.
public class ComparableDemo {
		public static void main(String args[])
		{
			ArrayList<Student> list = new ArrayList<Student>();
			
			Student john = new Student(3,"john");
			Student jane = new Student(1,"jane");
			Student Tom = new Student(2,"Tom");
			
			list.add(john);
			list.add(jane);
			list.add(Tom);
			
			Collections.sort(list);
			System.out.println("Students after sorting: ");
			list.forEach(Student -> System.out.println(Student.getName()));
			
		}
		

	}         // INCORRECT OUTPUT
