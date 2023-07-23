

class Demo{

	void m2(){
	
		System.out.println("Kale");
	}

	class Inner{
	
		void m1(){
		
			System.out.println("Prajwal Annaso Nikam");
		}
	}
}
class Client{

	public static void main(String[] args){

	Demo obj = new Demo();
	obj.m2();
	Demo.Inner obj1 = obj.new Inner();
	obj1.m1();

	}
}
