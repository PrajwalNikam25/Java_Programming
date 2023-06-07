// OverRaiding Demo:


class Parent{

	Parent(){
	
		System.out.println("In Parebnt Constructor:");
	}
	void fun(){
	
		System.out.println("In Parent method");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In Child Constructor");
	}
	void fun(int x){                                   // It gives The Parent method Because Child take the method from parent by inheritance
	
		System.out.println("In Child Method");
	}
}
class Client{

	public static void main(String[] a){
	      //Reference  = Object    
		Parent obj = new Child();
		obj.fun();
	}
}
