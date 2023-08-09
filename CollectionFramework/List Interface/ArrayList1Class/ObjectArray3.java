// Add Object in ArrayList:

import java.util.*;
class Demo{

	int num = 0;
	String name = null;

	Demo(int num ,String name){
	
		this.num = num;
		this.name = name;
	}                                // If we can't Override Method toString() in userdefine class 
	                                 // then it gives an address of Object
}
class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(new Demo(10,"om"));
		al.add(new Demo(13,"ok"));

		System.out.println(al);
	}
}
