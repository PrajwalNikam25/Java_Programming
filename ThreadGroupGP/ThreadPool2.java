// 2 ThreadPool:

import java.util.concurrent.*;

class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread() + "Start Thread");
		task();
		System.out.println(Thread.currentThread() + "End Thread");
	}
	void task(){
	
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}
	}
}
class MyThread1 implements Runnable{

	public void run(){
	
		System.out.println("Prajwal Nikam"+ Thread.currentThread());
		task();
		System.out.println("Shreya Kale"+ Thread.currentThread());
	}
	void task(){
	try{
		Thread.sleep(1000);
	}catch(InterruptedException te){
	
	}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		ExecutorService sr = Executors.newFixedThreadPool(3);

		for(int i = 0; i<5;i++){
		
			MyThread obj  = new MyThread();
			sr.execute(obj);
		}

		ExecutorService sr1 = Executors.newFixedThreadPool(3);

		for(int i = 0; i<5;i++){
		
			MyThread1 obj2  = new MyThread1();
			sr1.execute(obj2);
		}
		sr.shutdown();
		sr1.shutdown();
		
	}
}
