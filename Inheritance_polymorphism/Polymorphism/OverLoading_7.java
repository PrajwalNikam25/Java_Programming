// OverLoading Demo:
//
//                                    [B]
//
 class Demo{
 
	 void fun(Object obj){
	 
		 System.out.println("Object");
	 }
	 void fun(String str1){
	 
		 System.out.println("String");
	 }
 }
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.fun("Prajwal");
		obj.fun(new StringBuffer("Prajwal"));
		obj.fun(null);
	}
}
