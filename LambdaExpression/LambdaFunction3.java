// Lambda Function without parameter:


interface Demo{

	String fun(String name1,String name2);
}
class Client{

	public static void main(String[] a){
	
		Demo obj = (name1,name2) -> "Prajwal Nikam" + ":" + name1 + "//" + "Abhi Nikam" + ":" + name2;
	};

	obj.fun("Abc","xyz");
}
