// Creat Child Thread Group:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		ThreadGroup gp = new ThreadGroup("Prajwal");
		
		MyThread obj = new MyThread();
		Thread t = new Thread(gp,obj);
		t.start();

	}
}
