package SortAlgs;
import dataStructures.*;

public class BubbleSort {
	private static boolean recursive = false;
	private static boolean leastToGreatest = true;
	
	public static void sortLeastToGreatest(Boolean ltg) {
		BubbleSort.leastToGreatest = ltg;
	}
	
	private static void sortLinkedList(SinglyLinkedList<Integer> lst) {
		Boolean sorted;
		int size = lst.size();
		
		//perform the bubble sort
		do {
			sorted = true;
			for (int i=0; i<size; ++i) {
				for (int j=i; j<size; ++j) {
					//check the elements and swap when necessary
					if (BubbleSort.leastToGreatest) {
						if ((int)lst.getAt(i) > (int)lst.getAt(j)) {
							lst.swapNodes(i, j);
							sorted = false;
						}
					}
					else {
						if ((int)lst.getAt(i) < (int)lst.getAt(j)) {
							lst.swapNodes(i, j);
							sorted = false;
						}
					}
				}
			}
		}while (!sorted);
	}
	
	private static void sortDoublyLinkedList(DoublyLinkedList<Integer> lst) {
		Boolean sorted;
		int size = lst.size();
		
		//perform the bubble sort
		do {
			sorted = true;
			for (int i=0; i<size; ++i) {
				for (int j=i; j<size; ++j) {
					//check the elements and swap when necessary
					if (BubbleSort.leastToGreatest) {
						if ((int)lst.getAt(i) > (int)lst.getAt(j)) {
							lst.swapNodes(i, j);
							sorted = false;
						}
					}
					else {
						if ((int)lst.getAt(i) < (int)lst.getAt(j)) {
							lst.swapNodes(i, j);
							sorted = false;
						}
					}
				}
			}
		}while (!sorted);
	}
	
	public static void sort(SinglyLinkedList<Integer> lst) {
		if (!BubbleSort.recursive) {
			sortLinkedList(lst);
		}
		else {
			//recursive method of sorting
		}
	}
	
	public static void sort(DoublyLinkedList<Integer> lst) {
		if (!BubbleSort.recursive) {
			sortDoublyLinkedList(lst);
		}
		else {
			//recursive method of sorting
		}
	}
	
	
}
