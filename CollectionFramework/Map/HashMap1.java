// HashMap Demo:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		HashMap hs = new HashMap();

		hs.put("Prajwal","Nikam");
		hs.put("Vishal","Mahajan");
		hs.put("Om","Pawar");
		hs.put("Vaibhav","Pagare");

		System.out.println(hs);
	}
}
// HashMap Does Not follow Insertion Order:
// it Print entry as pre hashCode:
