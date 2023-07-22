// Instance Method:


class Demo{

	int x= 10;
	static int y =40;

	Demo(){
	
		System.out.println("In Constructor");
	}
	static {
	
		System.out.println("In Static Block1");
	}
	{
	
		System.out.println("In Instance 1");
	}
	public static void main(String[] a){
		
		Demo obj1 = new Demo();
		System.out.println("In main method");
	}
	static {
	
		System.out.println("In static block2");
	}
	{
	
		System.out.println("In instance 2");
	}
}
