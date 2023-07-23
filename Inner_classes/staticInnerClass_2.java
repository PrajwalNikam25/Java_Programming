


class Prajwal{

	void m1(){
	
		System.out.println("In Prajwal");
	}
	
	static class Nikam{
	
		void m1(){
		
			System.out.println("In Nikam");
		}
	}
}
class Client{

	public static void main(String[] args){
	
		Prajwal obj = new Prajwal();
		obj.m1();
		Prajwal.Nikam obj1 = new Prajwal.Nikam();
		obj1.m1();
	}
}
