// If there is default method in interface it can be override


interface Demo1{

	default void fun(){
	
		System.out.println("In fun1");
	}
}
interface Demo2{

	default void fun(){
	
		System.out.println("In fun2");
		
	}
}
class child implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("In Child");
		
	}
}
class client{

	public static void main(String[] a){
	
		Demo1 obj1 = new child();
		obj1.fun();
		Demo2 obj2 = new child();
		obj2.fun();
		child obj3 = new child();
		obj3.fun();
		
	}
}
