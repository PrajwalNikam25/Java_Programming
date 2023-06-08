//      Access Specifier in OverRiding:


class Parent{
        
         void fun(){    // Access Specifier : Default  Default have more scope then the public 
	
		System.out.println("In parent fun");
	}
}
class Child extends Parent{

        public void fun(){     // Access Specifier : public  public have less scope than the default
	
		System.out.println("In Child fun");
	}
}
class Client{

	public static void main(String[] a){
	
		Parent obj1 = new Child();
		obj1.fun();
	}
}

// if there is Private is prasent to any Methods os parent class and Chile class there is no overriding is doing:
