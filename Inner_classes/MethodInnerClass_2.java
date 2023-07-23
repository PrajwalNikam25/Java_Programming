// Method Local Inner class:



class Demo{

	void m1(){
	
		System.out.println("Prajwal Annso Nikam");

		class Inner{
		
			void m3(){
			
				System.out.println("Nikam");
			}
		}
			Inner obj1 = new Inner();
			obj1.m3();
	}
	void m2(){
	
		System.out.println("Avni");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj = new Demo();
		obj.m1();
		obj.m2();
	}
}
