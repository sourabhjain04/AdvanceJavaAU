package collectionAll;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> deque =new ArrayDeque<>();
		
		
		deque.addFirst(10);
		deque.addLast(20);
		deque.add(30);
		
		System.out.println(deque);
		
		deque.pollFirst();
		System.out.println(deque);

		deque.pollLast();
		
		System.out.println(deque);

		
		
	}

}
