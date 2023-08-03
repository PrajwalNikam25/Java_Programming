// Print Thread Name:


class MyThread extends Thread{

	public void run(){
	
		System.out.println(Thread.currentThread().getName());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}
