// Over Loading Demo:
//                                   
//                                   [A]
//
class Demo{

	void fun(String str1){
	
		System.out.println("String");
	}
	void fun(StringBuffer str2){
	
		System.out.println("StringBuffer");
	}
}
class Client{

	public static void main(String[] args){
	
		Demo Obj = new Demo();
		Obj.fun("Prajwal");
		Obj.fun(new StringBuffer("Prajwal"));
		//Obj.fun(null); This line Gives an error There is a ambigous:

	}
}
