package dataStructures;

public class Main {

	public static void main(String[] args) {
    
		DoublyLinkedList<Integer> mylist = new DoublyLinkedList<Integer>();
		mylist.pushBack(1);
		mylist.pushBack(2);
		mylist.pushBack(3);
		mylist.pushBack(4);
		mylist.pushBack(5);
		mylist.pushBack(6);
		mylist.pushBack(7);
		mylist.pushBack(8);
		//int value = (int)mylist.popAt(56).getData();
		
		for (int i=0; i<mylist.size(); ++i) {
			
			System.out.println(mylist.getAt(i));
		}
		//System.out.println("Popped value: " + value);
		

	}

}
