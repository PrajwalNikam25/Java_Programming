// Create Child Thread By Using Thread Class:


class MyThread extends Thread{

	MyThread(ThreadGroup tg , String str){
	
		super(tg,str);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
		try{
		
			Thread.sleep(2000);
		}catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread obj = new MyThread(pThreadGP,"Maharashtra");
		MyThread obj1 = new MyThread(pThreadGP,"Kerala");
		
		obj.start();
		obj1.start();
		
		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");

		MyThread obj2 = new MyThread(cThreadGP,"Karachi");
		MyThread obj3 = new MyThread(cThreadGP,"Lahore");
		
		obj2.start();
		obj3.start();
		
		ThreadGroup cThreadGP1 = new ThreadGroup(pThreadGP,"Bangladesh");

		MyThread obj4 = new MyThread(cThreadGP1,"Dhaka");
		MyThread obj5 = new MyThread(cThreadGP1,"Mirpur");
		
		obj4.start();
		obj5.start();

		Thread.sleep(2000);// by using this method all Thread are sleep in ThreadGroup so it show 0 count:

		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	}
}
// We use pThreadGP.activeCount() it gives only Thread Active in parent group and never give the count of all active Thread in class:


