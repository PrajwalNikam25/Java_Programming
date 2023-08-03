// Method Sleep():


class MyThread implements Runnable{

	public void run(){
	
		for(int i =0 ;i<3;i++){
		
			System.out.println(Thread.currentThread().getName());
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

		for(int i =0 ;i<3;i++){
		
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		
	}
}
