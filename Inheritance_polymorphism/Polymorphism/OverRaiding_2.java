// When we call Object as like it is vaild  [ Parent obj = new Cild()]
//                                               |              |
//                                            Reference       Object
// Reference check at the compile time and new object of Child is created at the run time :


class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	void fun(){
	
		System.out.println("In Parent method");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In child Constructror");
	}
	void fun(){
	
		System.out.println("In Child method");
	}
}
class Client{

	public static void main(String[] args){
	
		Parent Obj1 = new Child();
		Obj1.fun();
	}
}
