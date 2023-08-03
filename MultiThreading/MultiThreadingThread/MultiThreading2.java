// MultiThreading:


class MyThread extends Thread{

	public void run(){
	
		for(int i=0;i<10;i++){
		
			System.out.println("In run");
		}
	}
}
class Client{

	public static void main(String[] a){
	
		MyThread obj =new MyThread();
		obj.start();
		
		for(int i=0;i<10;i++){
		
			System.out.println("In Main");
		}


	}
}
