package collectionAll;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(30);
		pq.add(10);
		pq.add(20);
		System.out.println("Priority Queue: "+pq);// Order may not be visible
		
		
		while(!pq.isEmpty()) {
			System.out.println("polled:  "+pq.poll());
		}
		
		
		
		
	}

}
