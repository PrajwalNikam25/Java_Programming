// Real time example of OverRiding:


class Match{

	void matchtype(){
	
		System.out.println("Test/T20/ODI");
	}
}
class IPL extends Match{

	void matchtype(){
	
		System.out.println("T20");
	}
}
class ODI extends Match{

	void matchtype(){
	
		System.out.println("50-50");
	}
}
class Client{

	public static void main(String[] args){
	
		IPL type1 = new IPL();
		type1.matchtype();
         	ODI type2 = new ODI();
		type2.matchtype();
	}
}
