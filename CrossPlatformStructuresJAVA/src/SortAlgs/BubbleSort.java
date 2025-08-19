package SortAlgs;
import dataStructures.*;

public class BubbleSort {
	boolean recursive;
	
	private void swap(int val1, int val2) {
		//TODO
		//does nothing yet, need swap in lists
	}
	
	private void sortLinkedList(SinglyLinkedList<Integer> lst) {
		Boolean sorted;
		int size = lst.size();
		
		//perform the bubble sort
		for (int i=0; i<size; ++i) {
			for (int j=i; j<size; ++j) {
				//check the elements and swap when necessary
				if ((int)lst.getAt(i) < (int)lst.getAt(j)) {
					
				}
			}
		}
	}
	
	public static void sort(SinglyLinkedList<Integer> lst) {
		
	}
	
	public BubbleSort() {
		this.recursive = false;
	}
}
