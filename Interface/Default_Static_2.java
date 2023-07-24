
// Interface Demo

interface Demo{

	default void fun(){
	
		System.out.println("In fun");
	}
	void gun();
}
class child implements Demo{

	public void gun(){
	
		System.out.println("In gun");
	}
}
class client{

	public static void main(String[] a){
	
		Demo obj = new child();
		obj.fun();
		obj.gun();
	}
}
