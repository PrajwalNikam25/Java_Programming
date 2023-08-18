// Navigable Set:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		NavigableSet ns = new TreeSet();

		ns.add("Prajwal");
		ns.add("Mahesh");
		ns.add("Om");
		ns.add("Vaibhav");
		ns.add("Vishal");

		// lower(Element);
		System.out.println(ns.lower("Prajwal"));

		// floor(Element);
		System.out.println(ns.floor("Vishal"));

		//ceiling(Element);
		System.out.println(ns.ceiling("Om"));

		//higher(Element);
		System.out.println(ns.higher("Prajwal"));

		//pollFirst();
		System.out.println(ns.pollFirst());
		
		//pollLast();
		System.out.println(ns.pollLast());
	}
}
