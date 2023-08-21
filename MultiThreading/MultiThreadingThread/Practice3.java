// We cannot Override Start() Method:


class MyThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
	public void start(){
	
		System.out.println("In start");

		run();
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread t = new MyThread();

		t.start();

		System.out.println(Thread.currentThread());
	}
}
