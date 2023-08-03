// Set Priority :


class MyThread implements Runnable{

	public void run(){
	
		Thread m = Thread.currentThread();
		m.setPriority(8);
		System.out.println(m.getPriority());
	}
}
class Client{

	public static void main(String[] a){
	
		Thread y = Thread.currentThread();

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		y.setPriority(10);
		
		System.out.println( y.getPriority());


	}
}
