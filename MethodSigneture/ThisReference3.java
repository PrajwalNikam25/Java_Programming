// This Reference :


class Demo{

	int x = 30;

	Demo(){
	
		System.out.println(this.x);
		System.out.println(x);
	}
	Demo(int x){
	
		System.out.println(this.x);
		System.out.println(x);
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(50);
	}
}
