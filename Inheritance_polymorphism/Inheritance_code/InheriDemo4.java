

class Parent{

	int x =10;

	Parent(){
	
		System.out.println("In Parent");
	}
	void info(){
	
		System.out.println("In Parent Method");
	}
}
class Child extends Parent{

	int y =20;
	
	Child(){
	
		System.out.println("In Child");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		obj.info();
	}
}
