package collectionAll;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList ll = new LinkedList();
	
	ll.add("a");
	ll.add(10);
	ll.add(10.6);
	ll.add("ratan");
	ll.addFirst("Vedika");
	ll.addLast("Bhavya");
	
	System.out.println("original content : "+ll);
	
	System.out.println(ll.size());
	
	// remove the elements form Linked List
	
	ll.remove(10.6);
	ll.remove(0);
	
	System.out.println("After deletion content: "+ll);
	System.out.println(ll.size());
	
	
	}

}
