package Collections;
import java.util.ArrayList;
import java.util.List;

//Array list is the resizable implementation of the list interface.
//ArrayList is not thread safe.
  
public class Array_list {
	
	public static void main(String[] args)
	{
		List<Integer>arraylist = new ArrayList<>(5);
		for( int i=0;i<5;i++)
			arraylist.add(i);
		
		System.out.println(arraylist);
		
		arraylist.remove(3);
		
		System.out.println(arraylist);
		
		for(int i = 0; i<arraylist.size(); i++) 
			System.out.print(arraylist.get(i));
		                      //get() used to fetch an element from array list.
		                     //this iteration helps in removing square brackets in output.
	    System.out.println();
	    
		for(int i : arraylist)
	    	System.out.print(i+" ");
	}

}
