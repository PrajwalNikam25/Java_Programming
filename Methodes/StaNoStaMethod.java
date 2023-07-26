	//Static and non Ststic Methode:
class Demo{
		static void fun() {
			System.out.println("Enter in static method");
		}
		void gun(){
			System.out.println("Enter in non static method");
		}
		public static void main(String[] A){
			Demo obj = new Demo();
			obj.gun();
			fun();
		}
	}
