// This Reference :


class Demo{

	int x =10;

	Demo(){                                // Demo(Demo this)
		
		System.out.println(this);      
	
		System.out.println("Default-Constructor");
	}
	Demo(int x){                      // Demo(Demo this,int x)
		System.out.println(this);
		
		System.out.println("Para-Constructor");
	}
}
class Client{

	public static void main(String[] a){
	
		Demo obj1 = new Demo();   // By Default it pass Demo(obj)
		System.out.println(obj1);
		System.out.println();
		Demo obj2 = new Demo(30);  // Demo(obj2,30);
		System.out.println(obj2);
	}
}
