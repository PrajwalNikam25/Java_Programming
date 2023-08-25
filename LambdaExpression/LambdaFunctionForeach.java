// Lambda In for-each :

import java.util.*;

class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println(al);

		al.foreach((data) -> System.out.println(data));
	}
}
