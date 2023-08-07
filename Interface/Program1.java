// Interface:

interface Demo{

	void fun();
	void gun();
	void run();
}
class child implements Demo{

	public void fun(){
	
		System.out.println("In fun");
	}
	public void gun(){
	
		System.out.println("In gun");
	}
	public void run(){
	
		System.out.println("In run");
	}
}
class Client{

	public static void main(String[] a){
	
		child obj = new child();
		obj.fun();
		obj.gun();
	}
}
