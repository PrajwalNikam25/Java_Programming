import java.util.*;

class Cricket{

	int jerNo = 0;

	String Name = null;

	Cricket(int jerNo,String Name){
	
		this.jerNo = jerNo;

		this.Name = Name;
	}
	public String toString(){
	
		return Name + ":" + jerNo;
	}
}
class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(new Cricket(18,"Virat"));
		al.add(new Cricket(45,"Rohit"));
		al.add(new Cricket(7,"MSD"));

		System.out.println(al);
	}
}
