package dataStructures;

public class SinglyLinkedList<T> extends LinkedList<Object> {
	private Node head;	//Very first node in the list
	
	private Node getLastNode() {
		//make sure the head is not empty
		if (this.head != null) {
			//iterate through each node until the 
			//last node is found
			Node temp = this.head;
			while (temp.getNext()!=null) {
				temp = temp.getNext();
			}
			return temp;
		}
		return null;
	}
	
	//push data to the back of the list
	public void push(T newData) {
		//push straight to head if empty
		if (this.head == null) {
			this.head = new Node(newData);
		}
		else {
			//when head is not empty, iterate to the next point
			//that can be made into a new node
			Node temp = this.getLastNode();
			temp.setNext(new Node(newData));
		}
	}
	
	public int size() {
		return 0;
	}
	
	public SinglyLinkedList(){
		this.head = null; //empty head
	}
}
