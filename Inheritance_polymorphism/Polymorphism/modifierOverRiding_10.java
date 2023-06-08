// Static Modifier in Overriding method
// This is not concept of overriding 
// This is concept of method hiding

 class Parent{
 
	 static void fun(){
	 
		 System.out.println("In prarent Method");
	 }
 }
class Child extends Parent{

	static void fun(){
	
		System.out.println("In Child Method");
	}
}
class Client{

	public static void main(String[] a){
	
		Parent obj1 = new Parent();
		obj1.fun();
		Child obj2 = new Child();
		obj2.fun();
		Parent obj3 = new Child();   // in this case if there is static present compiler cheak the reference class  
		obj3.fun();	             // cheak the method block of reference class is there is method is present then compiler gives this Method
	}
}
