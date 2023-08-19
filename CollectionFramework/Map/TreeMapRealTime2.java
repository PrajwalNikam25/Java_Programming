// TreeSet RealTime Example:
import java.util.*;

class Demo implements Comparable{

	String str = null;
	int year = 0;

	Demo(String str,int year){
	
		this.str = str;
		this.year = year;
	}
	public String toString(){
	
		return "{" + str + ":" + year + "}";
	}
	public int compareTo(Object obj){
	
		return this.year - ((Demo)obj).year;
	}
}
class SortByName implements Comparator{

	public int compare(Object obj1,Object obj2){
	
		return ((Demo)obj1).str.compareTo((Demo)obj2).str;
	}
}
class Client{

	public static void main(String[] a){
	
		TreeMap tm = new TreeMap(new SortByName());

		tm.put(new Demo("Youtube",2005),"Prajwal");
		tm.put(new Demo("facebook",2009),"abhi");
		tm.put(new Demo("Instagram",2006),"Tanamay");

		System.out.println(tm);
	}
}
