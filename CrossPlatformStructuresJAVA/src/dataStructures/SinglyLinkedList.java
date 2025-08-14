package dataStructures;

public class SinglyLinkedList<T> extends LinkedList<Object> {
	private Node head;	//Very first node in the list
	
	
	public int size() {
		return 0;
	}
	
	public SinglyLinkedList(){
		this.head = null; //empty head
	}
}
