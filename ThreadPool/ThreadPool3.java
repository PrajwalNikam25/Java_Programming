// Creat Pool By another Way:

import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
	MyThread(int num){
	
		this.num=num;
	}
	public void run(){
	
		System.out.println(Thread.currentThread()+"Start Thread" + " " +num);
		Task();
		System.out.println(Thread.currentThread()+"End Thread" + " " +num);
	}
	void Task(){
	
		try{
		
			Thread.sleep(60000);
		}catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] a){
	
		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
			
		for(int i=1;i<5;i++){
		
			MyThread obj = new MyThread(i);
			tpe.execute(obj);
		}
	tpe.shutdown();	
	}
}
