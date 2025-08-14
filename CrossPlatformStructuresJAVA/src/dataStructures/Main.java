package dataStructures;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<Integer>();
		int value;
		mylist.push(1);
		mylist.push(2);
		mylist.push(3);
		mylist.push(4);
		mylist.push(5);
		mylist.push(6);
		mylist.push(7);
		mylist.push(8);
		value = (int)(mylist.popAt(5).getData());
		for (int i=0; i<mylist.size(); ++i) {
			
			System.out.println(mylist.getAt(i));
		}
		System.out.println("Popped value: " + value);
		

	}

}
