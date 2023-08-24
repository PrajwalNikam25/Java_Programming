// Comparable:

import java.util.*;

class Demo implements Comparable{

	String  str;

	Demo(String str){
	
		this.str = str;
	}
	public int compareTo(Object obj){
	
		return this.str.((Demo)obj).str;
	}
	public int  compareTo(){
	
		return str;
	}
}
class Client{

	public static void main(String[] a){
	
		PriorityQueue q = new PriorityQueue();

		q.offer(new Demo("Prajwal"));
		q.offer(new Demo("Nikam"));
		q.offer(new Demo("Nikam"));

		System.out.println(q);
	}
}
