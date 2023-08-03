// MultiThreading Demo:

class Prajwal{

	void fun(){
	
		System.out.println("In Prajwal");
	}
}
class MyThread extends Prajwal implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName());
		fun();
	}
/*	void fun(){
	
		System.out.println("In Run");
	}*/
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}
