package dataStructures;

public class DoublyLinkedList<T> extends LinkedList<Object>  {
	private Node head;	//Very first node in the list
	private Node tail;  //very last node in the list
	private int SIZE;	//number of elements calc'd with pushes and pops
	
	//iterators
	private void sizeUp() {
		++this.SIZE;
	}
	
	private void sizeDown() {
		--this.SIZE;
	}
	
	//O(n)
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
			return temp;
		}
		return null;
	}
	
	//O(n)
	//retrieve the data from at
	public Object getAt(int at) {
		return goToAt(at).getData();
	}
	
	//O(n)
	//remove the node from at
	public Node popAt(int at) {
		Node temp = goToAt(at);
		//Out of bounds error
		if (temp == null) {
			return null;
		}
		
		//Pop head if at head
		if (temp == this.head) {
			this.head = this.head.getNext();
			if (this.head != null) {
				this.head.setPrev(null); //delete head node only, preserve rest
			} else {
				this.tail = null; //clear out the list if head is only node
			}
			this.sizeDown();
			return temp;
		}
		
		//Pop tail if at tail
		if (temp == this.tail) {
			this.tail = this.tail.getPrev();
			if (this.tail != null) {
				this.tail.setNext(null); //delete head node only, preserve rest
			} else {
				this.tail = null; //clear out the list if head is only node
			}
			this.sizeDown();
			return temp;
		}
		
		//pops are much easier in doubly linked list
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		this.sizeDown();
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
			this.sizeUp();
		}
		else {
			//just push to the end
			this.tail.setNext(newnode);
			newnode.setPrev(tail);
			this.tail = newnode;
			this.sizeUp();
		}
	}
	
	
	
	
	public int size() {
		/* This costs more time!
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
		*/
		return this.SIZE;
	}
	
	public DoublyLinkedList(){
		this.head = null; //empty head
	}
}
