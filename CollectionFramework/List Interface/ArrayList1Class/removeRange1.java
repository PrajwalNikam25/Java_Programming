// removeRange();

import java.util.*;

class Demo extends ArrayList{

	public static void main(String[] a){
	
		Demo al = new Demo();

		al.add(10);
		al.add(20.5f);
		al.add("Prajwal");
		al.add(10);
		al.add("C2W");

		System.out.println(al);

		al.removeRange(1,3);      // When we Use The removeRange() this method is Protected
					  // so we need to extend ArrayList Because Protected method only access in Child Class:
		
		System.out.println(al);
		
	}
}
