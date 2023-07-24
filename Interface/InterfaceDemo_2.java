// Interface Demo



interface Demo{

	void fun();   // public abstract void fun();   scope is public 
	void gun();   // public abstract void gun();   scope is public
}
class child implements Demo{

	public void fun(){          //  therefore must  to write public
	
		System.out.println("In fun");
	}
	public void gun(){           // therfore must to write public 
	
		System.out.println("In gun");
	}

}
class Client{

	public static void main(String[] args){
	
	Demo obj = new child();
	obj.fun();
	obj.gun();
	}
}

// methods in the interface class They are by default public abstract
// so if we inherit that method we requried to make public  
