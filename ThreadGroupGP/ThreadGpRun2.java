// Create ThreadGroup :


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		ThreadGroup tg = new ThreadGroup("Prajwal");

		MyThread obj = new MyThread();
		Thread t = new Thread(tg,obj,"Nikam");

		t.start();
	}
}
