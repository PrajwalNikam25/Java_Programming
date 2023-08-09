// LinkedHashSet:


import java.util.*;

class Client{

	public static void main(String[] a){
	
		LinkedHashSet lh = new LinkedHashSet();

		lh.add(10);// Internally is pass as lh.add(new Integer(10));
			   // So,In Predefine classes This type of calls are handle
			   // So,There No Creat New object for each:   
		lh.add(20);
		lh.add(new Integer(10));
		lh.add(new Integer(20));

		System.out.println(lh);
	}
}
