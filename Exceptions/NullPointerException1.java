// NullPointerException:


class Demo{

	void fun(){
	
		System.out.println("In fun");
	}
	void gun(){
	
		System.out.println("In Gun");
	}
}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();

		obj.fun();
		obj=null;
		obj.gun();
	}
}
