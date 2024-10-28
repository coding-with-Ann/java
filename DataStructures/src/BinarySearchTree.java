//It is a binary tree with additional restrictions
//Left child value must be always less than root node
//right child value must be always greater than root node

//Insertion deletion and search is more efficient than a binary tree
//can represent data with some relation

//sorting is difficult
//Not much flexible(we can have only either no child, one or two children)

class Node{
	char key;
	Node left, right;
	Node(char key){
		this.key = key;
	}
}
class BinarySolution{
	Node root;
	
	void insertKey(char key) {
		root = insertInTree(root, key);
	}
	Node insertInTree(Node root, char key) {
		if(root == null) {
			root = new Node(key);
		}
		if(key<root.key) {
			root.left = insertInTree(root.left, key);
		}
		else if(key>root.key) {
			root.right = insertInTree(root.right, key);
		}
		return root;
	}
	
	void preorderTraversal(Node root) {
		if(root!=null) {
		System.out.print(root.key +" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		}
	}
	
	
}

public class BinarySearchTree {
	public static void main(String[] args) {
		BinarySolution t1 = new BinarySolution();
		t1.insertKey('C');
		t1.insertKey('I');
		t1.insertKey('B');
		t1.insertKey('G');
		t1.insertKey('M');
		t1.insertKey('A');
		
		t1.preorderTraversal(t1.root);
		
	}
		
		
}
