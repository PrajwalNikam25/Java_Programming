//                  Interface
//
// Interface is a class it have the .class file
// There is not possible to make a object of interface because interface is incomplete class
// Interface does not have the parent class
// we can use interface as a reference


interface Demo{

	void fun();  // this method intrnally goes like [public abstract void fun();]
	void gun();  // this method internally goes lie [publis abtsract void gun();]
}
class child implements Demo{

	public void fun(){
	
		System.out.println("In fun");
	}
	public void gun(){
	
		System.out.println("In gun");
	}
} 
class client{

	public static void main(String[] args){
	
		Demo obj = new child();
		obj.fun();
		obj.gun();
	}
}
