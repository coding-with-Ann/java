 package Collections;
import java.util.LinkedList;

//A kind of implementation where order of the elements is strictly maintained and one element is refering to next element
//In linked list elements are accessed using previous and next elements.
//We can't access a element directly from the linked list. we have to iterate from head to end 
public class Linked_list {
	
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.addFirst("B");
		list.addLast("N");
		list.add(3,"N");
		System.out.println(list);
		
		for(String i : list) {
			System.out.print(i);
		}
		
		list.remove("N");
		list.remove(0);
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		
	}

}
