package Recursion;
//Recursion is a phenomena of a method calling itself. 
//For loops can be used instead of recursion but recursion reduces the no of lines of code.
//Whatever defined inside a method that goes onto stack.
//YOU SHOULD KNOW WHEN TO END THE PROGRAM OTHERWISE THE PROGRAM GETS STUCK INTO INFINITE LOOP.
//This leads to stack overflow(consumes all memory in jvm)
//
public class RecursionDemo {
	public static void main(String args[])
	{
	
	ComplexFunction factorial = new ComplexFunction();
	System.out.println(factorial.calcFactorial(5));
	
	}
}
	
