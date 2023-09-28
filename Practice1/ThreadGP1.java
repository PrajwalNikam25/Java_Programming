// ThreadGroup:


class MyThread extends Thread{

	MyThread(ThreadGroup gp,String str){
	
		super(gp,str);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		ThreadGroup gp = new ThreadGroup("Prajwal");

		MyThread obj = new MyThread(gp,"Nikam");
		obj.start();
		
		System.out.println(Thread.currentThread());
	}
}
