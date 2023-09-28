// Coveriant DataType:


class Parent{

	float fun(){
	
		float t = 50.8f;

		return t;
	}
}
class Child extends Parent{

	float fun(){
	
		float t = 10.3f;

		return t;
	}
}
class Client{

	public static void main(String[] a){
	
		Parent obj = new Child();
		System.out.println(obj.fun());
	}
}
