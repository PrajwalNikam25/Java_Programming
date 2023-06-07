// Inheritance Demo:


class Demo{

	Demo(){
	
		System.out.println("In Parent");
	}
	void info(){
	
		System.out.println("In Method");
	}
}
class child extends Demo{

	child(){
	
		System.out.println("In child");
	}
}
class Client{

	public static void main(String[] a){
	
		child obj1 = new child();
		obj1.info();
	}
}
