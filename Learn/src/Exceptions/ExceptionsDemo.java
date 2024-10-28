package Exceptions;
//The simple reason for having existence of exceptions is that developers make  mistake.
//We do create bugs and errors while we write code.
// The testing team finds that defect and then they fix that defect.
//That is how a normal software development life cycle works.
//Every programming language provides their own exception and error framework to support a developer in spotting those errors and fixing those errors.

//THE ROOT(PARENT) CLASS OF EXCEPTION FRAMEWORK IS CALLED THROWABLE. iT IS DIVIDED INTO EXCEPTIONS AND ERRORS.
//UNDER EXCEPTION HEIRARCHY WE HAVE IO-EXCEPTIONS, SQL-EXCEPTION, CLASS NOT FOUND-EXCEPTION.
//IO-EXCEPTIONS COMES WHEN SOMETHING GOES WRONG WITH FILE-HANDING
//SQL EXCEPTIONS OCCUR WHEN YOU ARE WRITING SQL QUERIES AND SOMETHING GOES WRONG.
//CLASS NOT FOUND EXCEPTIONS COMES WHEN CLASS IS NOT FOUND OR CLASS IS BEING LOADED IN THE JVM.
//RUNTIME EXCEPTIONS ARE ARITHMATIC AND NUMBER NOT FOUND EXCEPTIONS etc.

//ERRORS ARE CLASSIFIED AS JVM ERRORS, RUNTIME AND FRAMEWORK ERRORS.

//Exception is a type of problem from which the program can be recovered which the developers should handle.
//On error types developers does not have any control. If it is a JVM error the developer can't do anything.
//Runtime exceptions are also called unchecked exceptions(because these exceptions are something which you do not have to explicitly specify in your program) and
//IO, SQL, CLASS NOT FOUND exceptions are called checked exceptions (because Java will force you handle these exceptions).
//
public class ExceptionsDemo {
	public static void main(String args[])
	{
		int data = 100/0;        //Runtime Exception(Arithmetic Exception.)
		System.out.println(data);
		
		String a = null;  // unchecked exception BECAUSE WE DONT KNOW IF THIS LINE THROW A EXCEPTION OR NOT.
		System.out.println(a.charAt(0));  //Null pointer exception.
	}

}
