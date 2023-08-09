// Enumaration Iterator:
// It is only use in the Vector:

import java.util.*;
class Client{

	public static void main(String[] a){
	
		Vector v = new Vector();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		Enumeration en = v.elements();

		while(en.hasMoreElements()){
		
			System.out.println(en.nextElement());
		}
	}

}
