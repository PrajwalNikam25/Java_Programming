// Multipale Thread Pool:

import java.util.concurrent.*;
class MyThread implements  Runnable{

	int num;
	MyThread(int num){
	
		this.num=num;
	}
	public void run(){
	
		System.out.println(Thread.currentThread()+"Start Thread"+" "+num);
		Task();
		System.out.println(Thread.currentThread()+"End Thread"+" "+num);

	}
	void Task(){
	
		try{
		
			Thread.sleep(2000);
		}catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] a){
	
		ExecutorService ser = Executors.newFixedThreadPool(3);

		for(int i = 1;i<5;i++){
		
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ExecutorService ser1 = Executors.newFixedThreadPool(3);

		for(int i = 1;i<5;i++){
		
			MyThread obj = new MyThread(i);
			ser1.execute(obj);
		}
		ser.shutdown();
		ser1.shutdown();
	}
}
