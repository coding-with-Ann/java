package Exceptions;

public class MyException extends Exception {

	//USE exception name <>extends<> Exception to create your own exception.
	
	MyException(){}
	
	MyException(String str){
	
		super(str);
	}

}
