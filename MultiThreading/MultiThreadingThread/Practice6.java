// Runnable Dmeo:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread t = new MyThread();
		Thread obj = new Thread(t,"Prajwal");
		obj.start();

	}
}
