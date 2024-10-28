package GraphDataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class Dfs {
	int v;
	ArrayList<Integer> adj[];
	
	Dfs(int noOfVertex){
		v = noOfVertex;
		adj = new ArrayList[noOfVertex];
		for(int i=0; i<noOfVertex; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	
	void edge(int x, int y) {
		adj[x].add(y);
	}
	
	void depthFirstSearch(int sourceVertex) {
		boolean visited[] = new boolean[v];
		Stack<Integer> s1 = new Stack<>();
	}
	

}
