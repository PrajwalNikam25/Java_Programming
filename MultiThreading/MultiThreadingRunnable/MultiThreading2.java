// MultiThreading Dmeo:


class MyThread implements Runnable{

	public void run(){
	
		for(int i=0;i<=5;i++){
		
			System.out.println("In run");
		}
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj = new MyThread();
		Thread t= new Thread(obj);
		t.start();

		for(int i=0;i<=5;i++){
		
			System.out.println("In main");
		}

	}
}
