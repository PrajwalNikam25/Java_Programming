// Objeect[] toArray();

import java.util.*;

class Demo{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add("Prajwal");
		al.add(10);
		al.add(20);

		Object arr[] = al.toArray();
		
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(al.lastIndexOf(10));
	
		al.clear();	
		System.out.println(al);
	}
}
