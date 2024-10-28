package Streams;
import java.util.ArrayList;
import java.util.List;

/* to change the representation of the collection in to
   one result we use reduce functionality of the stream api*/
//Here identity is the default value of the reduction function.
//Accumulator takes two parameters one is partial result and other is the next element of the stream.
//combiner if used is when there is a mismatch between the arguments of the accumulator-
// and types of accumulator implementation. simply when ans and i are of different data types

public class Streams_Reduce {
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int sum = list.stream().reduce(0,(ans, i)-> ans + i);
		System.out.println("sum of collection elements is "+ sum);
		
	}

}
