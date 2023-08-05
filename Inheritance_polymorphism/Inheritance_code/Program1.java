// Parent child Relation:


class Parent{

	int x =10;
	static int t  =30;

	Parent(){
	
		System.out.println("In Prent Constructor");
	}
	void access(){
	
		System.out.println("In Parent Method");
	}
}
class Child extends Parent{

	int x = 20;

	Child(){
	
		System.out.println(x);
	        System.out.println(this.x);
	}

}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		obj.access();
	}
}
