// Method Local Inner Class:
  


class Outer{     // class Name : Outer.class

	void M1(){
	
		System.out.println("In Method Outer");

		class Inner{    // class Name : Outer$1Inner.class
		
			void M1(){
			
				System.out.println("In Method Inner");
			}
		}
		 
		Inner obj = new Inner();  // for Call Class in Method we have to creat an [Object in his Method]
		obj.M1();
	}

	void M2(){
	
		System.out.println("In Method Outer");
	}
}
class client{

	public static void main(String[] args){
	
		Outer obj1 = new Outer();
		obj1.M1();
		obj1.M2();


	}
}


