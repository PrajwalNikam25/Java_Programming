// Itreator:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5f);
		al.add(30.5);
		al.add("Parjwal");

		Iterator itr = al.iterator();

		while(itr.hasNext()){
		
			System.out.println(itr.next());
		}
	}
}
