// Runnable Interface with lambda function:

class Client{

	public static void main(String[] a){
	
		Runnable rn1 = () -> {
		
			System.out.println(Thread.currentThread().getName());
		};

		Runnable rn2 = () -> {
		
			System.out.println(Thread.currentThread().getName());
		};

		Thread t1 = new Thread(rn1);
		Thread t2 = new Thread(rn2);

		t1.start();
		t2.start();
	}
}
