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
	}
}
