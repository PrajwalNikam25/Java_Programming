// User Define in LinkedHashMap:

import java.util.*;

class Demo{

	String str = null;

	Demo(String str){
	
		this.str = str;
	}
	public String toString(){
	
		return str;
	}
}
class Client{

	public static void main(String[] a){
	
		LinkedHashMap lm = new LinkedHashMap();

		lm.put(new Demo("Prajwal"),"Nikam");
		lm.put(new Demo("Abhi"),"Nikam");
		lm.put(new Demo("Tanmay"),"Nikam");

		System.out.println(lm);
	}
}
