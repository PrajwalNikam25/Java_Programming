// Add User Define Object:

import java.util.*;

class MyClass {

	int a = 0;

	String str = null;

	MyClass(int a , String str){
	
		this.a = a;

		this.str = str;
	}

	public String toString(){
	
		return str;
	}
}
class Client{

	public static void main(String[] a){
	
		Vector v = new Vector();

		v.add(new MyClass(10,"Prajwal"));
		v.add(new MyClass(10,"Abhi"));
		v.add(new MyClass(10,"Tanamay"));

		System.out.println(v);
	}
}
