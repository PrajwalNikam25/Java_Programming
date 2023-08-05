// This Reference:


class Demo{

	Demo(){
	
		System.out.println("Default Constructor");
	}
	Demo(int x){
	
		System.out.println("Para-Constructor");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj1 = new Demo();
		Demo obj = new Demo(20);
	}
}
