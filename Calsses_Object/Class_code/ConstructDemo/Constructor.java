// How Constructor is come in Picture in java code:


class Demo{

	
		int age = 20; //(Contructor it is use for initialize instance variable(Non-static variable))

		int jerNo =45;

		static void fun(){

			int x=0;
		
			System.out.println(x =10);
		}
		public static void main(String[] args){

			Demo obj = new Demo();
			obj.fun();
	}
}
//When we create object in main method,object is created on heap section,
//Constructor is a part as object
//Therfore constructor get place in object 
//And the Non satitc variable is initialize in counstructor
//   (Without Creating Object we cannot call Non-static Method as well as not getting place for Non-static variable )
