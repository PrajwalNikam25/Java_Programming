// Real Time Example of OverLoading:
  


class IPL{

	void Team(String team,String Captain){
	
		System.out.println("team = " + team );
		System.out.println("Captain = " + Captain );
	}
	void Team(String team,String Captain,int Tital){
	
		System.out.println("team = " + team );
		System.out.println("Captain = " + Captain );
		System.out.println("Tital = " + Tital );
	}
}
class Client{

	public static void main(String[] a){
	
		IPL obj = new IPL();
		obj.Team("Mumbai Indians","Rohit Sharma");
	}
}
