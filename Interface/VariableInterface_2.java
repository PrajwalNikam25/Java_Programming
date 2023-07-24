// Variable in Interface



interface Demo1{

	int x=10;
}
interface Demo2{

	int x=20;
}
class child implements Demo1,Demo2{

	int x=30;

	void fun(){
	
		System.out.println(x);
		System.out.println(Demo1.x);
		System.out.println(Demo2.x);
	}
}
class client{

	public static void main(String[] args){
	
		child obj = new child();
		obj.fun();
	}
}
