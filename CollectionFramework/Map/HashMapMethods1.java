// Methodes In HashMap:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		HashMap hs = new HashMap();

		hs.put("Prajwal","Nikam");
		hs.put("Om","Pawar");
		hs.put("Vaibhav","Pagare");
		hs.put("Vishal","Mahajan");
               
		// Get(Object);
		System.out.println(hs.get("Prajwal"));

		// keySet();
		System.out.println(hs.keySet());

		// values();
		System.out.println(hs.values());
	}
}
