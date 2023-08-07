//Create Thread Pool:

import java.util.concurrent.*;
class MyThread implements Runnable{

	int num;

	MyThread(int num){
	
		this.num = num;
	}
	public void run(){
	
		System.out.println(Thread.currentThread()+"Start Thread"+num);
		dailyTask();
		System.out.println();
		System.out.println(Thread.currentThread()+"End Thread"+num);


	}
	void dailyTask(){
	
		try{
		
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] a){
	
	ExecutorService src = Executors.newCachedThreadPool();

		for(int i =1;i<=9;i++){
		
			MyThread obj = new MyThread(i);
			src.execute(obj);
		}
		src.shutdown();
	}
}
