package Collections;
// Element which gone inside first is the element which out first.(FIFO)
//In queue the elements are inserted from rear to front.
//Insertion takes place from the rear end
//Deletion takes place from the front end
//As the elements are inserted rear shifts by one position.
//If rear == size of queue then you can't insert anymore elements
//This is the condition u need to check for inserting elements into the queue.
//when rear points to the first location it means there are no elements in the queue so u can't delete any element.
//This is the condition u need to check for deleting elements from the queue.
//In java queue is an interface which implements various other interfaces and classes
////////////////////////////////////////////////////////////////////////////////////

import java.util.PriorityQueue;

public class Queue {
	
	public static void main(String[] args)
	{
			java.util.Queue<String> queue = new PriorityQueue<>();
			queue.add("America");
			queue.add("India");
			queue.add("Germany");
			System.out.println("original queue is "+queue);// this is not sorted in natural order due to the top string method in syso.
			
			queue.remove();
			System.out.println("new queue is:"+ queue); // pops in natural sequence.******
			
			String head = queue.peek();
			System.out.println("head of the queue is:" + head);
			
			String head1 = queue.poll(); //removes and returns first element of the queue.
			System.out.println(queue); // Now head and tail is India.
			
	}

}
