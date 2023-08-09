// size();

import java.util.*;

class Demo{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add("Prajwal");

		System.out.println(al.size());
		System.out.println(al.contains("Prajwal"));

		ArrayList al2 = new ArrayList();

		al2.add(30);
		al2.add(40);
		al2.add("Nikam");

		al.addAll(al2);
		System.out.println(al);

		al.set(3,"Gitesh");
		System.out.println(al);

		System.out.println(al.get(5));
		System.out.println(al.indexOf("Prajwal"));

		System.out.println(al.remove("Ganesh"));
		System.out.println(al);

		



	}
}
