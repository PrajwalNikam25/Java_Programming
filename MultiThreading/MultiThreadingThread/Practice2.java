// MultiThreading:


class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<=5;i++){
		
			System.out.println(Thread.currentThread());
		}
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread t = new MyThread();

		t.start();
		
		for(int i=0;i<=5;i++){
		
			System.out.println(Thread.currentThread());
		}
	}
}
