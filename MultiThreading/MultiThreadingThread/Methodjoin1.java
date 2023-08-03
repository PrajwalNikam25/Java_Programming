// Concurrency Method Join::



class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<5;i++){
		
			System.out.println(Thread.currentThread());
			try{
			
				Thread.sleep(2000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		MyThread obj = new MyThread();
		obj.start();

		obj.join();     // if we use the method join on Thread-0 then it cannot execute Thread main until Thread-0 complete its work;

		for(int i=0;i<5;i++){
		
			System.out.println(Thread.currentThread());
		}
		
	}
}
