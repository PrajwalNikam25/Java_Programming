//    Variable in Interface


interface Demo1{

	int x=10;   //  public static final int x
	 void fun();// public abstract void fun();
}
interface Demo2{

	int x=20;
	 void fun();
}
class child implements Demo1,Demo2{

	public void fun(){
	
		System.out.println(Demo1.x);
		System.out.println(Demo2.x);
	}
}
class client{

	public static void main(String[] args){
	
		Demo1 obj = new child();
		obj.fun();
	}
}
// The vriable in Interface Get initialization on Stack frame
// And also Get the memory on stack frame:

