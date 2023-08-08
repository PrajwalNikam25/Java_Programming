// ListIterator:

import java.util.*;
class Client{

	public static void main(String[] a){
	
		LinkedList ll = new LinkedList();

		ll.add("Prajwal");
		ll.add("Om");
		ll.add("Vishal");
		ll.add("Vaibhav");

		ListIterator li = ll.listIterator();

		while(li.hasNext()){
		
			if("Vishal".equals(li.next())){
			
				li.remove();
			}
		}
		System.out.println(ll);
	}
}
