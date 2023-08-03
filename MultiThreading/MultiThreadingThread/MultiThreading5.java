// MultiThreading:


class Demo extends Thread{

	public void run(){
	
		System.out.println(getName());
	}
}
class MyThread extends Thread{

	public void run(){
	
		System.out.println(getName());
		
		Demo obj1 = new Demo();
		obj1.start();
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}
