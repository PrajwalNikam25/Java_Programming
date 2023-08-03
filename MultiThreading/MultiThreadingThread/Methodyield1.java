// Method Yield:


class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<=5;i++){
		
			System.out.println(getName());
			try{
			
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		MyThread obj = new MyThread();
		obj.start();

		obj.yield();
		
		for(int i=0;i<=5;i++){
		
			System.out.println(Thread.currentThread().getName());

			Thread.sleep(1000);
		}


	}
}
