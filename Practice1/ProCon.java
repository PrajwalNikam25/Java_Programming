

import java.util.concurrent.*;
import java.util.*;

class Producer extends Thread{

	BlockingQueue bq;

	Producer(BlockingQueue bq){
	
		this.bq = bq;
	}
	public void run(){
		
		for(int i=1;i<=10;i++){
	
		try{
			bq.put(i);
		}catch(InterruptedException e){
		
		}

		System.out.println("Producer = " + i);
		}
	}
}
class Consumer extends Thread{

	BlockingQueue bq ;

	Consumer(BlockingQueue bq){
	
		this.bq = bq;
	}
	public void run(){
		
		for(int i=1;i<=10;i++){
	
		try{
			bq.take();
		}catch(InterruptedException r){
		
		}
		
		System.out.println("Consumer = " + i);
		
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		BlockingQueue bq = new ArrayBlockingQueue(3);

		Producer obj1 = new Producer(bq);
		Consumer obj2 = new Consumer(bq);

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}
