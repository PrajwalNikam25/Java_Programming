// MultiThreading:


class MyThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread());

		setName("Prajwal");
	
		System.out.println(Thread.currentThread());
	}
}
class MyThread1 extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread());
		
		setName("Nikam");
		
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread t1 = new MyThread();
		MyThread1 t2 = new MyThread1();
		t1.start();
		t2.start();

		/*t1.setName("Prajwal");
		t2.setName("Nikam");
		t1.start();
		t2.start();*/

	}
}
