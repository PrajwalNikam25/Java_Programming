// We Can Give the body to any Method in tnterface By using [Default,static] keyword:


interface Demo{

	default void fun(){            // public default void fun();
	
		System.out.println("In fun");
	}
}
class child implements Demo{


}
class Client{

	public static void main(String[] a){
	
		Demo obj = new child();
		obj.fun();
	} 
}
