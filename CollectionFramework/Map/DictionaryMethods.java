// Method in Abstract class Dictionary:

import java.util.*;

class Client{

	public static void main(String[] s){
	
		Dictionary d = new Hashtable();

		d.put("Praj","Nikam");
		d.put("Om","Pawar");
		d.put("Vaibh","Pgare");
		d.put("Vish","Mahajan");
		d.put("Amar","yele");

		System.out.println(d);

		// int size();
		System.out.println(d.size());

		// boolean isEmpty();
		System.out.println(d.isEmpty());

		// keys();
		System.out.println(d.keys());

		//get(Object);
		System.out.println(d.get("Prajwal"));

		//put(Key , Vlaue);
		d.put("Prajwal","Army");
		System.out.println(d);

		// remove(Object);
		d.remove("Prajwal");
		System.out.println(d);
	}
}
