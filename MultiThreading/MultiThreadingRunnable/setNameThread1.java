// Set Name of Thread:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj,"Prajwal");
		t.start();
	}
}
