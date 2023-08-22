// MultiThreading:


class MyThread implements Runnable{


	public void run(){
	
		Thread t1 = Thread.currentThread();
		t1.setName("Prajwal");
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.out.println(Thread.currentThread());
	}
}
