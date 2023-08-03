// Set Name to Thread:


class MyThread extends Thread{

	MyThread(String str){
	
		super(str);
	}
	public void run(){
	
		System.out.println(Thread.currentThread());
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread("Prajwal");
		obj.start();
	}
}

