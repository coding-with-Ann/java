package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);           //put is used to add an entry to map.
		map.put("b", 2);
		System.out.println(map.size());
		System.out.println(map);
		
		if(map.containsKey("a"))       //returns boolean
		{
			Integer a = map.get("a"); //fetches a from map stores a value in Integer a 
		    System.out.println(a);
		}
		
		for(String item : map.keySet()) {
			System.out.println(item + " "+ map.get(item));
			System.out.println(map.get("a"));
		}
		
		for(Entry <String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
	}
}