// ParentChildDemo:


class Parent{

	Parent(){
	
		System.out.println(this);
		System.out.println("In Parent");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println(this);
		System.out.println("In Child");
	}
}
class Client{

	public static void main(String[] a){

		Parent obj = new Parent();
		System.out.println(obj);

		Child obj1 = new Child();
		System.out.println(obj1);
	}
}
