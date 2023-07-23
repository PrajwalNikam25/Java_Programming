// Normal Inner Class:
// Parent of Inner Class is Object class:
// Parent Of the Outer class Is Object Class: 


class Outer{   // class Name : Outer.class

	class Inner{   // class Name : Outer$Inner.class
	
		void fun(){
		
			System.out.println("In Inner Class");
		}
	}

	void fun(){
	
		System.out.println("In Outer Class");
	}
}
class client{

	public static void main(String[] args){
	
		Outer obj = new Outer();
		obj.fun();

		Outer.Inner obj1 = new Outer().new Inner();
		obj1.fun();

			//  OR  we call Inner Class by using this 

		Outer.Inner obj2 = obj.new Inner();
		obj2.fun();
	}
}


