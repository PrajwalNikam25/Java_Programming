// Real time example of OverLoading:


class IPL{

	void matchinfo(String team1,String team2){
	
		System.out.println(team1 + "vs" + team2);
	}
	void matchinfo(String team1,String team2,String venue){
	
		System.out.println(team1 + "vs" + team2);
		System.out.println("venue = " + venue);
	}
}
class client{

	public static void main(String[] args){
	
		IPL ipl2023 = new IPL();
		ipl2023.matchinfo("GT","CSK");
		ipl2023.matchinfo("GT","CSK","Motera");
	}
}

