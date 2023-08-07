// Variable in interface:


interface Demo{

	int x = 10;

	void fun();
}
class Child implements Demo{

	public void fun(){
	
		System.out.println(x);
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj = new Child();
		obj.fun();
	}
}
