// LinkedHashSetDemo:

import java.util.*;
class Client{

	public static void main(String[] a){
	
		LinkedHashSet lh = new LinkedHashSet();

		lh.add(10);
		lh.add(20);
		lh.add(10);
		lh.add(20);

		System.out.println(lh);
	}
}
