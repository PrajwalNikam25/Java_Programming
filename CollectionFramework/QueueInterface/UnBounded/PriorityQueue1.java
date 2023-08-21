// PriorityQueue:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		PriorityQueue pq = new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq);
	}
}
