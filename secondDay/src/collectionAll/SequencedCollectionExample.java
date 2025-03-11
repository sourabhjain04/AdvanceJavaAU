package collectionAll;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SequencedCollection<String> names = new ArrayList<>();
		
		names.add("Alice");
		names.add("Bob");
		names.add("David");
		names.add("Eve");
		
		System.out.println(names);
		
		System.out.println("First Element : "+ names.getFirst());
		
		System.out.println("Last Element : "+ names.getLast());
		
		
		names.removeFirst();
		
		System.out.println("After removing First Element : "+ names.getFirst());


		names.removeLast();
		System.out.println("After removing Last Element : "+ names.getLast());

	}

}
