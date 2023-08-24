// TreeSet Demo:

import java.util.*;

class MyClass implements Comparable{

	String t = null;

	MyClass(String t){
	
		this.t = t;
	}
	public int compareTo(Object t1){
	
		return (this.t).compareTo(t1.toString());
	}
	public String toString(){
	
		return t;
	}
}
class Client{

	public static void main(String[] a){
	
		TreeSet ts = new TreeSet();

		ts.add(new MyClass("Prajwal"));
		ts.add(new MyClass("Tanmay"));
		ts.add(new MyClass("Abhi"));
		ts.add(new MyClass("om"));

		System.out.println(ts);
	}
}
