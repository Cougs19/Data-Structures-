import java.util.*;

class Node{
	int data;
	Node next;
	
	//constructor
	Node(int data){
		this.data = data; // set data
		this.next = null;
	}
}

public class LinkedList_Demo {
	
	Node head;
	
	//insert in the front of the LinkedList with two parameters
	Node insertBegin(int key, Node head) {
		// temp to store the value
		Node temp = new Node(key);
		
		if(head == null) { // checks if the head is null
			head = temp;
		}
		else { // it is not null and next point is set to the head
			temp.next = head;
			head = temp; // head new value is temp
		}
			
		return head;
	}
	
	//insert push 
	public void push(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
	}
	
	//side method to get the size of the LinkedList
	int size(Node head) {
		
		Node temp = head; //temp assigned the head node
		int counter = 0;
		
		if(temp == null) {
			return 0;
		}
		else {
			while(temp != null) {
				temp = temp.next; // temp is assigned to the next value
				counter ++; // incrementing the counter		
			}
		}
		return counter;
	}
	
	void printList(Node head) {
		Node temp = head; // temp node is set to the head 
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("LinkedList\n");
		//LinkedList Example code
		
		LinkedList_Demo l = new LinkedList_Demo();
		l.head = null;
		
		Scanner in = new Scanner(System.in);
		//System.out.print(in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter value: ");
			l.head = l.insertBegin(in.nextInt(), l.head);
			l.push(in.nextInt());
		}
				
		l.printList(l.head); //display the linked list 
		System.out.println("\n" + l.size(l.head)); // the size the linked list
		in.close();
	}

}
