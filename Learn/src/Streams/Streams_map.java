package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Java introduced streams to JDK was to promote the functional programming paradime.
// Streams work like watching a youtube video. 
//streams are used in iterating and manipulating collections.
//video is downloaded bit by bit and gets removed from memory after watching.

//Note: Read functional interfaces and lambda functions. Also teminal operations and intermediate operations.

public class Streams_map {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		List<Integer> squareList = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squareList);
		                                //x-> x*x is the lambda function. toList() is the method to make a list.
	}

}
