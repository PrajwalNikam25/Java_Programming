/// TreeSet Using Predefine Class:

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

		t.add(new MyClass("Prajwal"));
		t.add(new MyClass("Abhishek"));
		t.add(new MyClass("Tanmay"));

		System.out.println(t);
	}
}
