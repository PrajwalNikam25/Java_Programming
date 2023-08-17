// LinkedHashMap Demo:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		LinkedHashMap lh = new LinkedHashMap();

		lh.put("Prajwal","Nikam");
		lh.put("Om","Pawar");
		lh.put("Vishal","Mahajan");
		lh.put("Vaibhav","Pagare");

		System.out.println(lh);
	}
}

// It preserve Insertion Order:
