// Set Priority to Thread:


class MyThread extends Thread{

	public void run(){
	
		Thread t = Thread.currentThread();
		//t.setPriority(9);
		System.out.println(t.getPriority());
	}
}
class Client{

	public static void main(String[] a){
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());

		MyThread obj = new MyThread();
		obj.start();

		t1.setPriority(7);
		
		MyThread obj1 = new MyThread();
		obj1.start();

	}
}
