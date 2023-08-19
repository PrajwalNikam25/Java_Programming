// TreeSet RealTime Example:
import java.util.*;

class Demo implements Comparable{

	String str =null;

	int year = 0;

	Demo(String str,int year){
	
		this.str = str;

		this.year = year;
	}
	public String toString(){
	
		return "{" + str + ":" + year + "}";
	}
	public int compareTo(Object obj){
	
		return this.year-((Demo)obj).year;
	}
}
class Client{

	public static void main(String[] a){
	
		TreeMap tm = new TreeMap();

		tm.put(new Demo("Youtube",2005),"Google");
		tm.put(new Demo("Facebook",2006),"Meta");
		tm.put(new Demo("Instagram",2009),"Meta");

		System.out.println(tm);
	}
}
