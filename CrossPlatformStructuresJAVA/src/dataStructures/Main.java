package dataStructures;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> mylist = new SinglyLinkedList<Integer>();
		
		mylist.push(1);
		mylist.push(2);
		mylist.push(3);
		for (int i=0; i<mylist.size(); ++i) {
			System.out.println(mylist.getAt(i));
		}
		

	}

}
