
class Parent{

	Parent(){
	
		System.out.println(this);
		System.out.println("In Parent");
	}
}
class Child extends Parent {

	Child(){
	
		System.out.println(this);
		System.out.println("In child");
	}
}
class Client{

	public static void main(String[] ar){
	
		Parent obj1 = new Parent();
		Child obj2 = new Child();
	}
}
