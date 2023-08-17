// In HashMap we cannot use dublicate Key value 
// but in IdentityHashMap we use dublicate Key :

import java.util.*;

class Client{

	public static void main(String[] a){
	
	        IdentityHashMap in = new IdentityHashMap();

		in.put("10","Prajwal");
		in.put("10","Abhi");
		in.put("10","Tanmay");

		System.out.println(in);
	}
}
