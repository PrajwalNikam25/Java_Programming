//  Over Raiding is concept of only for Inheritance
//  Over Raiding is only use when you are not Agree with your Parent class
//  In case Method in your Parent class is not Accepted by Child class then it change by using OverRaiding:


class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor:");
	}
	void info(){
	
		System.out.println("Gold,Land,Money");
	}
	void marry(){
	
		System.out.println("Dipika Padukon");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In Child Constructor");
	}
	void marry(){
	
		System.out.println("Alia Bhatt");
	}
}
class Client{

	public static void main(String[] a){
	
		Child obj = new Child();
		obj.info();
		obj.marry();
	}
}
