

class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
		try{
		
			Thread.sleep(2000);
		}catch(InterruptedException ie){
		
		}
	}	
}
class Client{

	public static void main(String[] a){
	
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		Thread t = new Thread(pThreadGP,obj1,"Maha");
		t.start();

		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");

		MyThread obj2 = new MyThread();
		Thread t1 = new Thread(cThreadGP,obj2,"Karachi");
		t1.start();

		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());


	}
}
