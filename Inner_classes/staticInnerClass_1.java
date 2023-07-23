//   ststic Inner Class:



class Outer{

	void fun(){
	
		System.out.println("In Method Outer");
	}

	static class Inner{
	
		void fun(){
		
			System.out.println("In Method Inner");
		}
	}
}
class client{

	public static void main(String[] args){

		Outer obj1 = new Outer();
		obj1.fun();
		Outer.Inner obj2 = new Outer.Inner(); //for calling Static class 
		obj2.fun();
	}
}
