// Multipale Inheritance Demo
//  Interface is support the multipale Inheritance


interface Demo1{

	void fun();
}
interface Demo2{

	void fun();
}
class Child implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("In Fun");
	}	
}
class client{

	public static void main(String[] a){
	
		Demo1 obj = new Child();
		obj.fun();
	}
}

