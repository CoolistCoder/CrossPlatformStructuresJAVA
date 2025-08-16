package dataStructures;

public class DoublyLinkedList<T> extends LinkedList<Object>  {
	private Node head;	//Very first node in the list
	private Node tail;  //very last node in the list
	
	//retrieve the node from at
	private Node goToAt(int at) {
		//throw out "at" that doesn't fit in domain
		Node temp = null;
		if (0 <= at && at < this.size()) {
			if (at < this.size() / 2) {
				int iterator = 0;
				temp = this.head;
				while (iterator < at) {
					temp = temp.getNext();
					++iterator;
				}
			}
			else {
				int iterator = this.size() - 1;
				temp = this.tail;
				while (iterator > at) {
					temp = temp.getPrev();
					iterator--;
				}
			}
			
			if (temp != null) {
				
				
				
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
	
	//O(1) optimization!
	//push data to the back of the list
	public void pushBack(T newData) {
		Node newnode = new Node(newData);
		//push straight to head if empty
		if (this.head == null) {
			this.head = newnode;
			this.tail = newnode;
		}
		else {
			//just push to the end
			this.tail.setNext(newnode);
			newnode.setPrev(tail);
			this.tail = newnode;
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
