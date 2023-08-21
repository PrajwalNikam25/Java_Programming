// MyThread Demo:


class MyThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class MyThread1 extends MyThread{

	public void run(){
	
		System.out.println(Thread.currentThread());

		MyThread t = new MyThread();
		t.start();
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread1 t1 = new MyThread1();

		t1.start();

		System.out.println(Thread.currentThread());
	}
}
