// Runnable:

class Demo{

	void fun(){
	
		//System.out.println("In Fun");
	}
}
class MyThread extends Demo implements Runnable{

	public void run(){
	
		//System.out.println(Thread.currentThread().getName());

		fun();

		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class Client{

	public static void main(String[] a){
	
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

		t.setPriority(9);
		
		Thread t2 = Thread.currentThread();
		System.out.println(t2.getPriority());
	}
}
