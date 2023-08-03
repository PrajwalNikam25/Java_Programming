// Method join();


class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<3;i++){
		
			System.out.println(getName());
			try{
			
				Thread.sleep(2000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}
class MyThread1 implements Runnable{

	public void run(){
	
		for(int i=0;i<3;i++){
		
			System.out.println(Thread.currentThread().getName());
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

		obj.join();

		MyThread obj1 = new MyThread();
		Thread t = new Thread(obj1);
		t.start();
		
		for(int i=0;i<3;i++){
		
			System.out.println(Thread.currentThread().getName());

			Thread.sleep(2000);
		}
	}
}
