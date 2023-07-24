//How to call static method in Interface?



interface Demo1{

	static void fun(){
	
		System.out.println("In 1 Static Fun");
	}
	default void gun(){
	
		System.out.println("In 1 default gun");
	}
}
interface Demo2{

	static void fun(){
	
		System.out.println("In 2 Static Fun");
	}
	default void gun(){
	
		System.out.println("In 2 default gun");
	}
}
class child implements Demo1,Demo2{

	public void gun(){
	
		System.out.println("Prajwal");
	}	
}
class client{

	public static void main(String[] a){
	
		Demo1 obj1 = new child();
		obj1.gun();
		Demo1.fun();
		Demo2.fun();
	}
}
