// Creat Child ThreaGroup:


class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());

		try{
		
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}
	}
}
class Client{

	public static void main(String[] ar){
	
		ThreadGroup gp = new ThreadGroup("IND");

		MyThread obj1 = new MyThread();
		Thread t1 = new Thread(gp,obj1,"Maha");
		
		MyThread obj2 = new MyThread();
		Thread t2 = new Thread(gp,obj2,"Delhi");
		
		t1.start();
		t2.start();
		
		ThreadGroup Cgp = new ThreadGroup(gp,"PAK");

		MyThread obj3 = new MyThread();
		Thread t3 = new Thread(Cgp,obj3,"Karachi");
		
		MyThread obj4 = new MyThread();
		Thread t4 = new Thread(Cgp,obj4,"Lahore");
		
		t3.start();
		t4.start();
		
		ThreadGroup Tgp = new ThreadGroup(gp,"BAN");

		MyThread obj5 = new MyThread();
		Thread t5 = new Thread(Tgp,obj1,"Dahaka");
		
		MyThread obj6 = new MyThread();
		Thread t6 = new Thread(Tgp,obj2,"Mirpur");
		
		t5.start();
		t6.start();

		System.out.println(gp.activeCount());
		System.out.println(gp.activeGroupCount());
	}
}
