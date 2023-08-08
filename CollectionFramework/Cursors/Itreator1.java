// Type of Cursor 1.Itreator
//                2.Enumaration
//                3.ListItreator
//                4.SplitItreator
//
//                                                  Itreator(Univarsal Itreator)

import java.util.*;

class ItreatorDemo{

	public static void main(String[] a){
	
		ArrayList ll = new ArrayList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		Iterator itr = ll.iterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
	}
}
