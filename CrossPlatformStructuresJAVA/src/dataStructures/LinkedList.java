package dataStructures;
//Author's note: Comments added to eliminate ambiguity

public abstract class LinkedList<T> {
	//All linked lists composed of nodes
	protected class Node{
		private T data;		//data contained within node
		private Node next;	//Node next to this one
		private Node prev;	//Node prior to this one (not singly)
	}
	
	public abstract int size(); //Retrieves the number of nodes in the list
}
