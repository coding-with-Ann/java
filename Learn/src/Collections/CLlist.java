package Collections;

public class CLlist {            //2:50
	Node head, tail;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
		this.data = data;
		}
	}
	void insertElements(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			tail.next = newNode;               
		}
		else {          //There are already some elements in the circular Llist
			
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		
	}
	
	void display() {
		Node n1 = head;
		if(tail == null && head == null) {
			System.out.println("CLL is empty, nothing to display");
		}
		else {
			do {
				System.out.print(n1.data +" ");
				n1 = n1.next;
				
			}while(n1!=head);
		}
	}
	void deleteElements() {
		if(tail!=head) {
			head = head.next;
			tail.next = head;
		}
		else {
			head = tail = null;
		}
	}
	public static void main(String[] args) {
		CLlist list1 = new CLlist();
		list1.insertElements(2);
		list1.insertElements(7);
		list1.insertElements(8);
		list1.display();
		System.out.println();
		list1.deleteElements();
		list1.display();
		
	}

}
