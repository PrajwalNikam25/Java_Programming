// ThreadGroup in Runnable method:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] args){
	
		ThreadGroup tg = new ThreadGroup("Prajwal");
		MyThread obj = new MyThread();
		Thread t1 = new Thread(tg,obj,"Nikam");
		t1.start();
		System.out.println(Thread.currentThread());

	}
}
