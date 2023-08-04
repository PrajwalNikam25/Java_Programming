// ThreadPool:

import java.util.concurrent.*;
class MyThread implements Runnable{

	int num = 0;

	MyThread(int num){
	
		this.num=num;
	}

	public void run(){
	
		System.out.println(Thread.currentThread() + "Start Thread" + num);
		task();
		System.out.println(Thread.currentThread() + "End Thread" + num);
	}
	void task(){
	
		try{
		
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] a){
	
		ExecutorService sr = Executors.newFixedThreadPool(3);

		for(int i = 0;i<10;i++){
		
			MyThread obj = new MyThread(i);
			sr.execute(obj);
		}
		sr.shutdown();
	}
}
