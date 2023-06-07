// Static Block in Parent Class:


class Parent{

	static String x = "2514350";

	static {
	
		System.out.println("Shreya");
	}
	void surname(){
	
		System.out.println("Nikam");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("Prajwal");

//		System.out.println(x);
	
		surname();

		System.out.println(x);
	}
}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();

	}
}
