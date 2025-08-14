package dataStructures;

public class SinglyLinkedList<T> extends LinkedList<Object> {
	private Node head;	//Very first node in the list
	
	//find the last node in the list
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
	
	//retrieve the node from at
	private Node goToAt(int at) {
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
			return temp;
		}
		return null;
	}
	
	//retrieve the data from at
	public Object getAt(int at) {
		return goToAt(at).getData();
	}
	
	//remove the node from at
	public void removeAt(int at) {
		Node temp = goToAt(at);
		//if head node
		if (temp == this.head) {
			this.head = temp.getNext();
		}
		//if last node
		else if (temp==getLastNode()) {
			temp = this.goToAt(at-1);
			temp.setNext(null);
		}
		//if not first or last
		else {
			Node previous, after;
			previous = this.goToAt(at-1);
			after = this.goToAt(at+1);
			previous.setNext(after);
			
		}
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
