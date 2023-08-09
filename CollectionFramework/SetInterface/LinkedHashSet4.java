//LinkedHashSet:

import java.util.*;

class Demo{

	int t = 0;

	String x = null;

	Demo(int t,String x){
	
		this.x =x;
		this.t=t;
	}
	public String toString(){
	
		return x +":" +t;
	}
}

class Client{

	public static void main(String[] a){
	
		LinkedHashSet lh = new LinkedHashSet();

		lh.add(new Demo(10,"P"));
		lh.add(new Demo(20,"R"));
		lh.add(new Demo(30,"A"));
		lh.add(new Demo(10,"P"));

		System.out.println(lh);
	}
}
