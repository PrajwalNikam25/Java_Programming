// Produser Consumer Problem:

import java.util.concurrent.*;

class Producer implements Runnable{

	BlockingQueue bq;

	Producer(BlockingQueue bg){
	
		this.bq = bq;
	}
	public void run(){
	
		for(int i= 1;i<=10;i++){
		
			try{
			
				bq.put(i);
			}
			catch(InterruptedException ie){
			
			}

			System.out.println("Produser" + i);

		}
	}
}
class Consumer implements Runnable{

	BlockingQueue bq ;

	Consumer(BlockingQueue bq){
	
		this.bq = bq;
	}
	public void run(){
	
		for(int i=1;i<=10;i++){
		
			try{
			
				bq.take();
			}
			catch(InterruptedException it){
			
			}
			System.out.println("Consumer" + i);
		}
	}
}
class Client{

	public static void main(String[] a){
	
		BlockingQueue bq = new ArrayBlockingQueue(3);

		Producer produce = new Producer(bq);
		Consumer consume = new Consumer(bq);

		Thread t1 = new Thread(produce);
		Thread t2 = new Thread(consume);

		t1.start();
		t2.start();

	}
}
