// MultiThreading Demo:


class MyThread implements Runnable{

	public void run(){
	
		MyThread1 obj1 = new MyThread1();
		Thread t1 = new Thread(obj1);
		t1.start();
		for(int i =0;i<5;i++){
		
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyThread1 implements Runnable{

	public void run(){
	
		for(int i =0;i<5;i++){
		
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		for(int i =0;i<5;i++){
		
			System.out.println(Thread.currentThread().getName());
		}
	}
}
