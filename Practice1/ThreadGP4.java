// Thread group:

class MyThread extends Thread{

	MyThread(ThreadGroup tg , String str){
	
		super(tg,str);
	}

	public void run(){
	
		System.out.println(Thread.currentThread());

		try{
		
			Thread.sleep(1000);
		}catch(InterruptedException ic){
		
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		ThreadGroup tg = new ThreadGroup("India");

		MyThread obj1 = new MyThread(tg , "Om");
		MyThread obj2= new MyThread(tg , "Vishal");
		MyThread obj3 = new MyThread(tg , "Vaibhav");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup ctg = new ThreadGroup(tg,"Pakistan");
		
		MyThread obj4 = new MyThread(ctg , "a");
		MyThread obj5= new MyThread(ctg , "b");
		MyThread obj6 = new MyThread(ctg , "c");

		obj4.start();
		obj5.start();
		obj6.start();
	
		ThreadGroup ctg1 = new ThreadGroup(tg,"Pakistan");

                MyThread obj7 = new MyThread(ctg1 , "a");
                MyThread obj8= new MyThread(ctg1 , "b");
                MyThread obj9 = new MyThread(ctg1 , "c");

                obj7.start();
                obj8.start();
                obj9.start();


	//	Thread.sleep(1000);
		
		System.out.println(tg.activeCount());
		System.out.println(tg.activeGroupCount());
	}
}
