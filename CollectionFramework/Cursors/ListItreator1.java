// ListItretor :

import java.util.*;

class Client{

	public static void main(String[] aq){
	
		LinkedList ll = new LinkedList();

		ll.add("Prajwal");
		ll.add("Nikam");
		ll.add("Abhishek");
		ll.add("Tanamay");

		ListIterator litr = ll.listIterator();

		while(litr.hasNext()){
		
			System.out.println(litr.next());
		}
	}
}
