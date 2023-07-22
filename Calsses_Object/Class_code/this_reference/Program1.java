// this reference:


class Demo{

	Demo(){	//Demo(Demo this) by Default:
	
		System.out.println("In No-Argu constructor");
	}
	Demo(int x){ //Demo(Demo this,int x) by Default:
	
		System.out.println("In Para constructor");
	}
	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(20);
	}
}
