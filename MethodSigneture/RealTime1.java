// This Referance :


class Demo{

	private int jerNo = 0;
	private String jerName = null;

	Demo(int jerNo,String jerName){
	
		this.jerNo = jerNo;
		this.jerName = jerName;
	}
	void fun(){
	
		System.out.println(jerName + "=" + jerNo);
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj = new Demo(7,"Dhoni");
		obj.fun();
		Demo obj1 = new Demo(45,"Rohit");
		obj1.fun();
		Demo obj2 = new Demo(18,"Virat");
		obj2.fun();

	}
}
