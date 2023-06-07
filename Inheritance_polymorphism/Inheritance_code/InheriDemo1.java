//   Inheritance Demo:


 class ICC{
 
	 ICC(){
	 
		 System.out.println("In ICC");
	 }
 }
class BCCI extends ICC{

	BCCI(){
	
		System.out.println("In BCCI");
	}
}
class Client{

	public static void main(String[] a){
	
		BCCI obj = new BCCI();
	}
}
