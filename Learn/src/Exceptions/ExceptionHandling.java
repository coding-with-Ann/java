package Exceptions;
//Exception handling using try catch block.
//Try catch block is a bunch of syntax which we use to handle exceptions in java.
//try{    write the code which might throw exception. 
              //you can handle the exception in catch block }
//catch (ExceptionType Name)
//         {write what you want to do with exception.}

//catch(ExceptionType Name){   
                //        }

//If an exception occurs in a try block then it goes to first catch block
//to match the exception type if not matches the name then goes to second and so on..

// If the logic of two exceptions in catch block is same then you can use one catch block.

//catch(exceptionType name1 | exceptionType name2)
//{
//	}

//The finally block is also used together with the try catch block to perform some cleanup operations.
//The code in the finally block is always executed irrespective of the fact that an exception occur or does not occur.
//You can write the finally block without catch block as well.
//You can write catch block without try block as well but it is of no use.



public class ExceptionHandling {
	public static void main(String[] args) {
		
	TryCatchDemo trycatch = new TryCatchDemo();
	trycatch.writeList();
	
	}

}
