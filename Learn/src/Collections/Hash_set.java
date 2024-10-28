package Collections;
import java.util.HashSet;
import java.util.Set;

//In hash set elements are accessed in a random fashion.
//They will not be accessed in a fixed sequence.
//null elements are allowed in hash set.
public class Hash_set {
	
	public static void main(String[] args)
	{
		Set <String> hashset = new HashSet<>();
		hashset.add("A");
		 boolean r1 = hashset.add("N");
		System.out.println(r1);
		boolean r2 = hashset.add("N");
		System.out.println(r2);
		System.out.println(hashset);
		
		System.out.println(hashset.contains("A")); //checks elements existence.
		
//		hashset.remove("A");
//		System.out.println(hashset);
		
		for(String i : hashset)
			System.out.println(hashset);
		
		
		
	}

}
