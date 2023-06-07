// OverLoading Demo:


class Demo{

	void fun(){
	
		System.out.println("In Method 1");
	}
	void fun(int x){
	
		System.out.println("In Method 2");
	}
}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.fun();
		obj.fun(10);
	}
}
// OverLoading It is Possible only When Two same Method are Present in the Same Class :
// There is no Parent Child relation is required

