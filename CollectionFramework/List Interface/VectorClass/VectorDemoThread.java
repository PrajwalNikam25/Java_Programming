// MultiThread on Vector Class:

import java.util.*;
class MyThread extends Thread{

	Vector v ;

	MyThread(Vector v){
	
		this.v = v;
	}
	public void run(){
	
		v.addElement(10);
	}
}
class MyThread1 extends Thread{

	Vector v ;

	MyThread1(Vector v){
	
		this.v = v;
	}
	public void run(){
	
		v.addElement(20);
	}
}
class Client{

	public static void main(String[] a){
	
		Vector v = new Vector();

		MyThread t1 = new MyThread(v);
		MyThread1 t2 = new MyThread1(v);

		t1.start();
		t2.start();

		try{
		
			Thread.sleep(1000);
		}catch(InterruptedException p){ //   we Use Thred.sleep() because main Thread Go to Dead State:
		
		}

		System.out.println(v);
	}
}
