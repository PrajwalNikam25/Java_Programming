// WeakHashMap:

class Demo{

	String str;

	Demo(String str){
	
		this.str=str;
	}
	public String toString(){
	
		return str;
	}
	public void finalize(){
	
		System.out.println("Notify");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj1 = new Demo("Prajwal");
		Demo obj2 = new Demo("Nikam");
		Demo obj3 = new Demo("Abhi");

		System.out.println(obj1);
		System.out.println(obj2);

		obj1=null;

		System.gc();

		System.out.println("In main");
	}
}
