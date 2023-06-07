// OverRiding Demo:


class Parent{

	        Object fun(){
	
		System.out.println("In Parent");
		return new Object();
	}
}
class Child extends Parent{

                String fun(){
	
		System.out.println("In child");
		return "Prajwal";
	}
}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}
