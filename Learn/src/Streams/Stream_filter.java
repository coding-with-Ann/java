package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_filter {
	
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("python");
		languages.add("Java");
		languages.add("Scala");
		
		List<String> filterList = new ArrayList<>();
		for(String item : languages) {
			
			if(item.startsWith("p")) {
				filterList.add(item);
			}
		}
		System.out.println(filterList); //Regular method.
		
		List<String> filterresult = languages.stream().filter(s-> s.startsWith("p")).
		                             collect(Collectors.toList());
		                             // use filter while using condition in streams 
		
		System.out.println(filterresult); //using streams api.
	}

}
