// Class Demo


class Demo{

	String Name = "Prajwal nikam";

	char Div = 'c';

	int Roll = 44;

	void info(){
	
		System.out.println(Name);
		System.out.println(Div);
		System.out.println(Roll);
	}
}
class Student{

	public static void main(String[] args){
	
		Demo obj =new Demo();

		obj.info();


	}
}
