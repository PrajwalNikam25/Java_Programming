// for Call Multipal Constructor by makin only one Object:

class Demo{

	Demo(){
		this(50);
		System.out.println("1111");
	}
	Demo(int x){
		
		System.out.println(x);
		System.out.println("2222");
	}
	public static void main(String[] args){
	
		Demo obj = new Demo();
	}
}
