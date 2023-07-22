// Real Time Example of Static and instance variable


class INDteam{

	int PlySalary=10000;
	
	static String Headcoach="Ravi Shastri";

	void crikInfo(){
	
		System.out.println(PlySalary);

		System.out.println(Headcoach);
	}
}
class cricket{

	public static void main(String[] arg){
	
		INDteam obj=new INDteam ();
		INDteam obj1=new INDteam ();

		obj.crikInfo();
		obj1.crikInfo();

		System.out.println("------------------------------------");
		
		obj1.PlySalary=30000;
		obj1.Headcoach = "Rahul dravid";
		
		obj.crikInfo();
		obj1.crikInfo();


	}
}
