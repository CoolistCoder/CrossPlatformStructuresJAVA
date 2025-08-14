package dataStructures;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<Integer>();
		
		mylist.push(1);
		mylist.push(2);
		mylist.push(3);
		mylist.push(4);
		mylist.push(5);
		mylist.push(6);
		mylist.push(7);
		mylist.push(8);
		mylist.removeAt(5);
		for (int i=0; i<mylist.size(); ++i) {
			System.out.println(mylist.getAt(i));
		}
		

	}

}
