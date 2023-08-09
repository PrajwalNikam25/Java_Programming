// HashSet Demo:
// HashSet does not Priserved Insertion Order:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);

		System.out.println(hs);
	}
}
