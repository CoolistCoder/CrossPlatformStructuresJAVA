package dataStructures;

import SortAlgs.BubbleSort;

public class Main {

	public static void main(String[] args) {
    
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<Integer>();
		mylist.pushBack(5);
		mylist.pushBack(2);
		mylist.pushBack(2);
		mylist.pushBack(4);
		mylist.pushBack(5);
		mylist.pushBack(9);
		mylist.pushBack(7);
		mylist.pushBack(3);
		int value = (int)mylist.popBack().getData();
		System.out.println("Size: " + mylist.size());
		
		//perform sort
		BubbleSort.sortLeastToGreatest(false);
		BubbleSort.sort(mylist);
		
		for (int i=0; i<mylist.size(); ++i) {
			
			System.out.println(mylist.getAt(i));
		}
		System.out.println("Popped value: " + value);
		

	}

}
