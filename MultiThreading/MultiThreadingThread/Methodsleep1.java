// Method Sleep():



class MyThread extends Thread{

	public void run(){
	
		for(int i =0;i<=10;i++){
		
			System.out.println(getName());
			try{                                 // We Cannot throws Exception because run method is override from the Thread Class and in
							     // Thread class Exception is not throws so we have must be to use try catch to handle 
							     // Exception:
			
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}
class Client{

	public static void main(String[] a)throws InterruptedException{
	
		MyThread obj = new MyThread();
		obj.start();

		for(int i =0;i<=10;i++){
		
			System.out.println(Thread.currentThread().getName());

			Thread.sleep(1000);
		}

	}
}
