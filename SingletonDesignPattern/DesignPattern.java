// Singleton Design Pattern:



class singleton{

	static singleton obj = new singleton();

	private singleton(){
	
		System.out.println("Constructor");
	}

	static singleton getobject(){
	
		return obj;
	}
}
class Client{

	public static void main(String[] a){
	
		singleton obj1 = singleton.getobject();
		System.out.println(obj1);
	}
}
