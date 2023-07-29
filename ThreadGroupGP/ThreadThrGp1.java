// Thread Group:


class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){
	
		super(tg,str);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		ThreadGroup tg = new ThreadGroup("Prajwal");
		MyThread obj =  new MyThread(tg,"t1");
		obj.start();

		System.out.println(Thread.currentThread());
	}
}

