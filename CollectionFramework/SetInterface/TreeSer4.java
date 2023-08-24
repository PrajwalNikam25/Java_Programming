// Treeset Of user Define Class:

import java.util.*;

class MyClass implements Comparable{

	String str = null;

	MyClass(String str){
	
		this.str = str;
	}
	public int compareTo(Object obj){
	
		return (this.str).compareTo(obj.toString());
	}
	public String toString(){
	
		return str;
	}
}
class Client{

	public static void main(String[] a){
	
		TreeSet t = new TreeSet();

		t.add(new MyClass("A"));
		t.add(new MyClass("D"));
		t.add(new MyClass("B"));
		t.add(new MyClass("C"));

		System.out.println(t);
	}
}
