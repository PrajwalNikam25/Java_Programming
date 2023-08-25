// Lambda Function in comparetor:

import java.util.*;

class Employee{

	int id = 0;
	String str = null;

	Employee(int id,String str){
	
		this.id = id;
		this.str = str;
	}
	public String toString(){
	
		return id + ":" + str;
	}
}
class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();
               
		al.add(12,"Prajwal");
		al.add(10,"Om");
		al.add(15,"Vishal");

		System.out.println(al);

		Collections.sort(al,(obj1,obj2)->{
			
			return ((Employee)obj1).str.compareTo(((Employee)obj2).str);
		}
		);
		System.out.println(al);
	}
}
