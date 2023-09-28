// ArrayList:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20.5f);
		al.add("Prajwal");
		al.add(40);

		System.out.println(al);
		
		ArrayList al1 = new ArrayList();

		al1.add(10);
		al1.add(20.5f);
		al1.add("Prajwal");
		al1.add(40);

		System.out.println(al.size());

		System.out.println(al.contains("Prajwal"));

		System.out.println(al.indexOf(20.5f));

		System.out.println(al.get(1));

		al.set(2,40.5f);
		
		System.out.println(al);
		
		System.out.println(al.remove(40.5f));

		al.addAll(al1);

		System.out.println(al);

	}
}
