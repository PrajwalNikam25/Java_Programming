// IdentityHashMap:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		IdentityHashMap id = new IdentityHashMap();

		id.put(new Integer(10),"Prajwal");
		id.put(new Integer(10),"Abhi");
		id.put(new Integer(10),"Tanmay");
		id.put(new Integer(10),"Aditya");

		System.out.println(id);
	}
}
