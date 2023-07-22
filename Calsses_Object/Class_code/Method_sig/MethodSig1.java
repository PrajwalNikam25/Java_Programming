// Method Signature


class Demo{

	Demo(){
	
		System.out.println("Prajwal");
	}
	Demo(int x){
	
		System.out.println("Nikam");
	}
	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);

	}
}
//If there are two Similar Constructor is present in program then it gives an error:

