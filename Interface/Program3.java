// Interface:


interface Parent{

	void fun();
	void gun();
}
interface child extends Parent{


}
class Child1 implements child{

	public void fun(){
	
		System.out.println("In fun");
	}
	public void gun(){
	
		System.out.println("In gun");
	}
}
class Client{

	public static void main(String[] a){
	
	Parent obj = new Child1();
	obj.fun();
	obj.gun();

	}
}
