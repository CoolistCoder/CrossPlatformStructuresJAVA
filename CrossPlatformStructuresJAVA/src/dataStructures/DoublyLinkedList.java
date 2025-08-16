package dataStructures;

public class DoublyLinkedList<T> extends LinkedList<Object>  {
	private Node head;	//Very first node in the list
	
	//retrieve the node from at
	private Node goToAt(int at) {
		//throw out "at" that doesn't fit in domain
		Node temp = null;
		if (0 <= at && at < this.size()) {
			temp = this.head;
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
		}
		return null;
	}
	
	//retrieve the data from at
	public Object getAt(int at) {
		return goToAt(at).getData();
	}
	
	//remove the node from at
	public Node popAt(int at) {
		Node temp = goToAt(at);
		//do nothing if the list is empty
		if (temp == null) {
			return null;
		}
		
		//pop head if 0
		if (at == 0) {
			this.head = this.head.getNext();
			this.head.setPrev(null);
			return this.head;
		}
		
		//pops are much easier in doubly linked list
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		return temp;
	}
	
	//push data to the back of the list
	public void pushBack(T newData) {
		//push straight to head if empty
		if (this.head == null) {
			this.head = new Node(newData);
		}
		else {
			//when head is not empty, iterate to the next point
			//that can be made into a new node
			//make sure the head is not empty
			Node temp = this.head;
			Node prev = null;
			if (temp != null) {
				//iterate through each node until the 
				//last node is found
				while (temp.getNext()!=null) {
					prev = temp;
					temp = temp.getNext();
				}
			}
			
			temp.setNext(new Node(newData));
			temp.setPrev(prev);
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
	
	public DoublyLinkedList(){
		this.head = null; //empty head
	}
}
