// Lambda Function with parameter:


interface Demo{

	void fun(int x);
}
class Client{

	public static void main(String[] a){
	
		Demo obj = (x) -> {                    // We can write (x) as without bracket
						       // we can write {}; without brackect if there is one line: 
		
			System.out.println("Prajwal Nikam" + x);
		};
		obj.fun(10);
	}
}
