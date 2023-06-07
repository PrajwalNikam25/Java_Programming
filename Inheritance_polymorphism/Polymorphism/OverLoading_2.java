// OverLoading Demo:


class Demo{

	void fun(int x){
	
		System.out.println("In Method 1");
	}
	void fun(int x,float y){
	
		System.out.println("In method 2"); 
	}
}
class client{

	public static void main(String[] ae){
	
		Demo obj = new Demo();
		obj.fun(10);
	}
}
