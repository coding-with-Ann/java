package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
	
	public static void main(String[] args)
	{
		List<String> languages = new ArrayList<>();
		languages.add("python");
		languages.add("java");
		languages.add("scala");
		
//	List<String> sortedlist = languages.stream().sorted().
//                collect(Collectors.toList());
//		System.out.println(sortedlist);          //to sort
		
			
		languages.stream().forEach(y-> System.out.println( y));   //forEach to iterate 
	}

}
