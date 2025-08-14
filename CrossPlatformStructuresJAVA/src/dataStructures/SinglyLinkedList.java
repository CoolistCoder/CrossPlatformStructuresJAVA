package dataStructures;

public class SinglyLinkedList<T> extends LinkedList<Object> {
	private Node head;	//Very first node in the list
	
	private Node getLastNode() {
		//make sure the head is not empty
		Node temp = this.head;
		if (temp != null) {
			//iterate through each node until the 
			//last node is found
			while (temp.getNext()!=null) {
				temp = temp.getNext();
			}
		}
		return temp;
	}
	
	public Object getAt(int at) {
		Node temp = this.head;
		if (temp != null) {
			//iterate through each node until
			//the last node is found or the
			//iteration value is met
			int iterator = 0;
			while (temp.getNext()!=null && iterator < at) {
				temp = temp.getNext();
				++iterator;
			}
			return temp.getData();
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
		Node temp = this.head;
		if (temp != null) {
			//iterate through each node until
			//the last node is found and increase
			//the iterator by 1 for each node
			int iterator = 0;
			while (temp!=null) {
				temp = temp.getNext();
				++iterator;
			}
			return iterator;
		}
		return 0;
	}
	
	public SinglyLinkedList(){
		this.head = null; //empty head
	}
}
