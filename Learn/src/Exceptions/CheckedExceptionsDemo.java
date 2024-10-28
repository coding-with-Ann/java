package Exceptions;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

//checked exceptions are compile time exceptions.
//unchecked exceptions are runtime exceptions.

public class CheckedExceptionsDemo {
	public static void main(String args[]) throws FileNotFoundException,IOException,  MyException 
	// whoever calls this program(the caller) now has the responsibility to handle this exception.
	{
		
		FileReader file = new FileReader("C:\\test\\a.txt");  //file not found exception.
		BufferedReader fileInput = new BufferedReader(file);
		
		for(int counter = 0; counter<3; counter++)
		{
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
		//throws new MyException.
		throw new MyException();
	}

}
