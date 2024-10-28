package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo {
	
	public void writeList() {
		
	try {
	List<Integer> list = new ArrayList<>(10);
	list.add(10);                                    //10 is stored at index 0
	
	System.out.println("entering try statement");
	Integer a = list.get(1);                        //accessing element at index 1
	System.out.println("accesing the first element:"+a); 
	}
	
	catch (IndexOutOfBoundsException e) {
		System.err.println("got index out of bound exception"+e.getMessage());  //err
		
	}
	
	finally {
		System.out.println("This block is always executed");
	        }
   }
}
