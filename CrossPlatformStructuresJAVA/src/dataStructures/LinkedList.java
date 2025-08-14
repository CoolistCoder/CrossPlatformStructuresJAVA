package dataStructures;
//Author's note: Comments added to eliminate ambiguity

public abstract class LinkedList<T> {
	//All linked lists composed of nodes
	protected class Node{
		private T data;		//data contained within node
		private Node next;	//Node next to this one
		private Node prev;	//Node prior to this one (not singly)
		
		//getters
		T getData() {
			return this.data;
		}
		
		Node getNext() {
			return this.next;
		}
		
		Node getPrev() {
			return this.prev;
		}
		
		//setters
		void setData(T newData) {
			this.data = newData;
		}
		
		void setNext(Node newNext) {
			this.next = newNext;
		}
		
		void setPrev(Node newPrev) {
			this.prev = newPrev;
		}
	}
	
	public abstract int size(); //Retrieves the number of nodes in the list
}
