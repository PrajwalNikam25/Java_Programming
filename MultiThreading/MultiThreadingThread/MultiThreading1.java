// Create Thread :


class MyThread extends Thread{

	public void run(){
	
		System.out.println("In run");
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		obj.start();

		System.out.println("In Main");
	}
}
