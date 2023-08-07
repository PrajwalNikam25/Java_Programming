// Variable in Interface:

interface  Demo1{

	int x =10;
}
interface Demo2{

	int x=20;
}
class Child implements Demo1,Demo2{

	int x=30;

	void fun(){
	
		System.out.println(Demo2.x);
	}
}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		obj.fun();
	}
}

