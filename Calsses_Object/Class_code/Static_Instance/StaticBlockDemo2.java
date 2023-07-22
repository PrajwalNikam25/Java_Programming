// Static Block Demo


class Demo{
	
	int x =10;
	static int y =40;

	static{
	
		System.out.println("Prajwal Annaso Nikam");
	}
	public static void main(String[] a){
	
		System.out.println("Baramati");
		Demo obj = new Demo();
		System.out.println(obj.x);
	}
	static{
	
		System.out.println("Indian Army");
		System.out.println(y);
	}
}
// If there are number of static  Block Are present in program they all Blocks are get Mearged:
// Sequance of execution
// 	static block
// 	main method
