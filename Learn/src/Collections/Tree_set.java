package Collections;
import java.util.TreeSet;

//To maintain natural order of the elements tree sets are used.
public class Tree_set {
	
	public static void main(String[] args) {
		
		TreeSet <String> treeset = new TreeSet<>();
		treeset.add("C");
		treeset.add("B");
		treeset.add("A");
		System.out.println(treeset); //prints in natural order ABC
		
		//Hashset prints this randomly everytime. 
	}

}
