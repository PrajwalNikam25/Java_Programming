// MultiThreading Demo:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println("In run");
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		System.out.println("In main");
	}
}
