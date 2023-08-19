// Ierating Over Map:

import java.util.*;

class Client{

	public static void main(String[] a){
	
		TreeMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");
		tm.put("NZ","Newziland");

		System.out.println(tm);

		Set<Map.Entry> data = tm.entrySet();

		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){
		
			Map.Entry abc = itr.next();

			System.out.println(abc.getKey() + ":" + abc.getValue());
		}
	}
}
