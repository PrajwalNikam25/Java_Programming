// OverRiding :

class Parent{

	int fun(int a, int b){

		int sum = a+b;

		return sum;
	}
}
class Child{

	int fun(int a ,int b){
	
		int sub = a-b;

		return sub;
	}
}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		System.out.println(obj.fun(10,20));
	}
}
