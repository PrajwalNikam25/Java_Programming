// MultiThreading on synchronized Method:

import java.util.*;
class Test{

	public synchronized void m1(){
	
		for(int i=0;i<=5;i++){

			System.out.println(Thread.currentThread().getName());
			try{
			
				Thread.sleep(1000);
			}catch(InterruptedException p){
			
			}
		}
	}
}
class MyThread extends Thread{

	Test t ;

	MyThread(Test t){
	
		this.t = t;
	}
	public void run(){
	
		t.m1();
	}
}
class MyThread1 extends Thread{

	Test t;

	MyThread1(Test t){
	
		this.t=t;
	}
	public void run(){
	
		t.m1();
	}
}
class Client{

	public static void main(String[] a){
	
		Test t = new Test();

		MyThread t1 = new MyThread(t);
		MyThread1 t2 = new MyThread1(t);

		t1.start();
		t2.start();
	}
}
