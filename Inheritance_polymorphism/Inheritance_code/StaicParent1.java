// Static in Parent Class :


class Parent{

	 void run(){
	
		System.out.println("In run");
	}
}
class Child extends Parent{

	static void fun(){
	
		System.out.println("In fun");
	}

}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		Child.fun();
	}
}
