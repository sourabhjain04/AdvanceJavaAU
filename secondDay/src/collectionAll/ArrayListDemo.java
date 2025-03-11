package collectionAll;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creation of array List
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("initial size of the arraylist : "+al.size());
		
		// adding element to the array list
		al.add("Bob");
		al.add("Alice");
		al.add("Romeo");
		al.add(null);
		al.add("Eve");
		System.out.println(al);
		System.out.println("ArrayList size: " +al.size());

		al.remove("Eve");
		System.out.println("ArrayList size: " +al.size());
		
		
	}

}
