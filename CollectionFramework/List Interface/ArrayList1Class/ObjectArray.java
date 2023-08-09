// add User define Object in ArrayList:


import java.util.*;

class CricPlayer{

	String jerName = null;

	int jerNo = 0;

	CricPlayer(int jerNo,String jerName){
	
		this.jerName = jerName;
		this.jerNo = jerNo;
	}
	public String toString(){           // When we add User define Class Object Then We have Compaltion to Override The 
					    // toString method From the Object Class:
	
		return jerName +":"+ jerNo;
	}                                   // If we Cant Override The Method The It Only Print The Object Address
}
class Client{

	public static void main(String[] a){
	
		ArrayList al = new ArrayList();

		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(7,"Dhoni"));
		al.add(new CricPlayer(25,"Prajwal"));

		System.out.println(al);
	}
}

