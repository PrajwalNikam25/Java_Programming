

// this Reference Demo

 class Demo{
 	
	 int x =10;

	 Demo(){
	 	System.out.println(this.x);
	 	System.out.println(x);
		System.out.println("111");
	 }
        
	 Demo(int x ){
	 	
		 System.out.println(this.x);
	         System.out.println(x);
	         System.out.println("222");
	 }
	 public static void main(String[] args){
	 
		 Demo obj1 = new Demo();
		 System.out.println("---------------------------------");
		 Demo obj2 = new Demo(30);
	 }
 }
