// SortedMap:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Aus","Austalia");
		sm.put("Ban","Bangladesh");
		sm.put("NZ","Newziland");
		sm.put("Pak","Pakistan");

		System.out.println(sm);

		// subMap();
		System.out.println(sm.subMap("Aus","NZ"));

		// headMap();
		System.out.println(sm.headMap("NZ"));

		// tailMap();
		System.out.println(sm.tailMap("NZ"));

		// firstKey();
		System.out.println(sm.firstKey());
		
		// lastKey();
		System.out.println(sm.lastKey());
		
		// keySet();
		System.out.println(sm.keySet());
		
		// values();
		System.out.println(sm.values());
		
		// entrySet();
		System.out.println(sm.entrySet());

	}
}
