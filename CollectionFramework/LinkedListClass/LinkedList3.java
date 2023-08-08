// Add User Define object in LinkedList:


import java.util.*;

class Demo{

	int  no = 0;

	String name = null;

	Demo(int no , String name){
	
		this.no = no;
		this.name = name;
	}
	public String toString(){
	
		return name + no;
	}
}
class Client{

	public static void main(String[] a){
	
		LinkedList ll = new LinkedList();

		ll.add(new Demo(10,"Prajwal"));
		ll.add(new Demo(20,"Nikam"));

		System.out.println(ll);

		ll.addLast("VP");
		
		System.out.println(ll);

		System.out.println(ll.get(2));

		ll.set(2,"TC");

		System.out.println(ll);

		ll.removeFirst();

		System.out.println(ll);

		ll.removeLast();

		System.out.println(ll);

		System.out.println(ll.contains("Nikam20"));
	
		System.out.println(ll.getFirst());

		ll.clear();

		System.out.println(ll);
	}
}
