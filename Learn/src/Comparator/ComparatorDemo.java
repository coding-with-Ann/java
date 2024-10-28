package Comparator;

import java.util.ArrayList;
import java.util.Collections;

//For natural sorting we use collections.sort and comparable
//For custom sorting (other than natural sorting) we can use COMPARATOR.
//what if you want to sort objects that don't implement comparable then we can use comparator.
//We can create multiple comparators and each comparator will focus on a particular sorting order.

public class ComparatorDemo {
	
	public static void main(String args[]) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student john = new Student("John",1,10);
		Student Jane = new Student("Jane",2,11);
		Student Tom = new Student("Tom",3,12);
		
		list.add(john);
		list.add(Jane);
		list.add(Tom);
		
		Collections.sort(list, new AgeComparator());
		System.out.println("Students after age sorting: ");
		list.forEach(Student -> System.out.println(Student.getName()));
		
		
	}
}
	
	