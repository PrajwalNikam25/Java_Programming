// Body to the interface:


interface Demo1{

	static void fun(){
	
		System.out.println("In fun");
	}
}
class Child implements Demo1{


}
class Client{

	public static void main(String[] a){
	
		Demo1.fun();
	}
}
// If we use [static keyword] for giving body to the mathod in interface 
// So, we do naot override this method 
// for calling this method use [ class name.method name ]
