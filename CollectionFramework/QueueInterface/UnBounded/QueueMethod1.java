// Queue Demo:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		Queue q = new LinkedList();

		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);

		System.out.println(q);

		//poll();
		q.poll();     // if  Queue is empty then this method print null []:
		System.out.println(q);
		
		//remove();
		q.remove();  // if Queue is empty then this method throws an exception NosuchElementException:
		System.out.println(q);

		// peek();   // if queue is empty then this method print null
		System.out.println(q.peek());
		
		//element();
		System.out.println(q.element());
		
	}
}
