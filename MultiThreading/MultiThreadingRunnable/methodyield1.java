//Method yield:


class MyThread implements Runnable{

	public void run(){
	
		for(int i=0;i<3;i++){
		
			System.out.println("Run");
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
		Thread t = new Thread(obj);
		t.start();

		t.yield();
		
		for(int i=0;i<3;i++){
		
			System.out.println("main");
			Thread.sleep(1000);
		}

	}
}
