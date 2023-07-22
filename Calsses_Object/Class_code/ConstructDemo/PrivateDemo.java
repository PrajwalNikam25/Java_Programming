// Privat Variable and Ststic variable Demo


class Demo{

	int x = 10;
	
	private int y =20;

	static int z = 30;

	void fun(){
	
		System.out.println(x);
		
		System.out.println(y);
		
		System.out.println(z);
	}
}
class mainDemo{

	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		
		Demo obj2 = new Demo();               // y can not access in other class when it is private (Private variable is accessable only in his class not in other) 

		obj1.fun();

		obj2.x=1000;
		
		obj2.z=3000;                         // Z is a ststic variable it is accessable for all (If satic variable is change in one object this change is shoen in other class)

		System.out.println("--------------------------------");

		obj1.fun();
		
		obj2.fun();



	}
}
