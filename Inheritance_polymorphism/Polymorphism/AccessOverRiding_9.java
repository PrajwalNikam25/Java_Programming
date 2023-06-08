//                       final
//      final it is use for if we have the Method of the parent class is not pass to the child class then we use final keyword:
  


class ICC{

	final void info(){
	
		System.out.println("ODI");
        }
}
class IPL extends ICC{

	 void info(){
	
		System.out.println("T20");
	}
}
class Client{

	public static void main(String[] args){
	
		ICC obj1= new ICC();
		obj1.info();
	}
}
