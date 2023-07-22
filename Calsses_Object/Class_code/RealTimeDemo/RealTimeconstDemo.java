// Real Time Example for classes and Object:

class INDteam{
	
		String Captain = "Rohit Sharma";

		String Batsman = "Virat Kohli";

		int winTital = 4;

		int wc = 2;
		
		void cricket(){
		
			String event = "ODI worldcup";

			System.out.println(event);
			System.out.println(Batsman);
			System.out.println(winTital);
			System.out.println(wc);
		}
	}

class user{

public static void main(String[] args){

	INDteam obj = new INDteam();

	obj.cricket();
}
}
