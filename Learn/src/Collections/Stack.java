package Collections;

import java.util.Iterator;
//Advantages
// Stack represents (LIFO) stack of objects. 
//All operations are of O(1) complexity.
//Last element is readily available for use.

//Disadvantages
//Manipulation is restricted to the top of the stack
//Not much flexible

public class Stack {
	
	public static void main(String[] args)
	{
		java.util.Stack<String> stack = new java.util.Stack<String>();  //******
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
	    String top = stack.peek();  //returns top element without poping it. 
	    System.out.println(top);
	    stack.search("B");       //REturns the index of element B
	    Boolean status = stack.empty();    //Checks if stack is empty or not
	    System.out.println(status);
	    
	    
	    //To iterate over a stack
	    Iterator it = stack.iterator();
	    while(it.hasNext()) {          //hasNext()is a method of iterator class
	    	Object s = it.next();
	    	System.out.print(s);
	    }
	    System.out.println(stack.size());     //to get size of stack
	    stack.sort(null);                     //sort
	    System.out.println(stack);
	    
	}

}
