// Deque Demo:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		Deque d = new ArrayDeque();

		d.offer(10);
		d.offer(40);
		d.offer(20);
		d.offer(30);
		d.offer(50);

		System.out.println(d);

		// OfferFirst();  // OfferLast();
		d.offerFirst(5);
		d.offerLast(60);
		System.out.println(d);
		
		// pollFirst();  // pollLast();
		d.pollFirst();
		d.pollLast();
		System.out.println(d);
		
		// peekFirst();  // peekLast();
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());

		System.out.println();

		//iterator();
		
		Iterator itr = d.iterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}

		System.out.println();

		//descendingIterator();
		
		Iterator itr2 = d.descendingIterator();

		while(itr2.hasNext()){
		
			System.out.println(itr2.next());
		}
		
	}
}
