// Giving Body to method in interface by using Default key word:


interface Demo{

	default void fun(){
	
		System.out.println("In fun");
	}
}
class Child implements Demo{

	public void fun(){
	
		System.out.println("In fun 2");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj = new Child();
		obj.fun();
	}
}
