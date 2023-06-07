

// Static Block in Parent class:


class Parent{

	static {
	
		System.out.println("In Parent Static Block:");
	}
}
class Child extends Parent{

	static {
	
		System.out.println("In Child Static Block:");
	}
} 
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
	}
}
