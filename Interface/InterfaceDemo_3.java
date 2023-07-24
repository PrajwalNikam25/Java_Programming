// interface Demo:
  



interface Demo{

	void fun();
	void gun();
}
abstract class child implements Demo{

}
class child2 extends child{

        public void fun(){
	
		System.out.println("In fun");
	}
	public void gun(){
	
		System.out.println("In gun");
	}
}
class Client{

	public static void main(String[] args){
	
		child obj = new child2();
		obj.fun();
		obj.gun();
	}
}
