// Variable in Interface:


interface Demo{

	int x=10;

	void fun();
}
class Child implements Demo{

	int x = 20;

	public void fun(){
	
		System.out.println(x);
		
		System.out.println(Demo.x);
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj = new Child();
		obj.fun();
	}
}

