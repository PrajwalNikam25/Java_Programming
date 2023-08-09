// Add user define Object in ArrayList:

import java.util.*;

class Demo{

	int a = 0;
	
	String name = null;

	Demo(int a, String name){
	
		this.a = a;

		this.name = name;
	}
	public String toString(){
	
		return name + ":" + a;
	}
}
class Project{

	int b = 0;
	
	String name = null;

	Project(int b,String name){
	
		this.b = b;

		this.name = name;
	}
	public String toString(){
	
		return name;
	}
}
class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(new Demo(10,"Sachin"));
		al.add(new Demo(25,"Dhawan"));
		al.add(new Project(90,"Gale"));

		System.out.println(al);
	}
}
