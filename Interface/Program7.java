//  default Keyword in interface:


interface Demo1{

	default void fun(){
	
		System.out.println("fun-1");
	}
}
interface Demo2{

	default void fun(){
	
		System.out.println("fun-2");
	}
}
class Child implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("In child");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo1 obj = new Child();
		obj.fun();
	}
}
