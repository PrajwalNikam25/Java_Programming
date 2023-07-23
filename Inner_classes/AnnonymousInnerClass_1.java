//         Annonymous Inner Class:


class Outer{

	void fun(){
	
		System.out.println("In Outer");
	}
}
class client{

	public static void main(String[] args){
	
		Outer obj = new Outer(){
		
		};
		obj.fun();
	}
}
