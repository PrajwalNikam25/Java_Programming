// Real Time Overriding :


class IndianDefance{

	void UniformServices(){
	
		System.out.println("Army/Navy/Airforce");
	}
}
class Army extends IndianDefance{

	void UniformServices(){
	
		System.out.println("Army Chif = General Manoj Pande" );
	}
}
class Navy extends IndianDefance{

	void UniformServices(){
	
		System.out.println("Navy Chif = Admiral R. Hari Kumar");
	}
}
class Airforce extends IndianDefance{

	void UniformServices(){
	
		System.out.println("AirForce Chif = Air Marshal Saju Balakrishnan");
	}
}
class Client{

	public static void main(String[] a){
	
		IndianDefance obj1 = new Army();
		obj1.UniformServices();
		
		IndianDefance obj2 = new Navy();
		obj2.UniformServices();
		
		IndianDefance obj3 = new Airforce();
		obj3.UniformServices();
	}
}
