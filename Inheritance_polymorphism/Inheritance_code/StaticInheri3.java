// Static inheritance Demo:


class Parent{

	int x = 10;

	static int y = 20;

	static{
	
		System.out.println("In Parent Static Block:");
	}
	Parent(){
	
		System.out.println("In Parent Constructor:");
	}
	void info(){
	
		System.out.println(x);
		System.out.println(y);
	}
	static void info2(){
	
		System.out.println(y);
	}
}
class Child extends Parent{

	static{
	
		System.out.println("In child Static Block:");
	}
	Child(){
	
		System.out.println("In child Constructor:");
	}
}
class Client{

	public static void main(String[] args){
	
		Child obj1 = new Child();
		obj1.info();
		obj1.info2();

	}
}
