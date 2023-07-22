// Default and Private Demo


class Demo{

	int x =25;
	
	String Name = "Prajwal";

	void info(){
	
		System.out.println(x);

		System.out.println(Name);
	}
}
class mainDemo{

	public static void main(String[] args){
	
		Demo obj =new Demo();
//		Demo obj1 =new Demo();

		obj.info();

		System.out.println(obj.x);
		System.out.println(obj.Name);



	}
}
