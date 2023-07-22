class CompanyInfo{

	static String companyName = "NVIDIA";
	static String companyLocation = "Pune";
	String EmpName = "Rajesh";
	int Empsalary = 100000;
	int EmpId = 23;

	static void companyLocation(){
	
		System.out.println("Name of company =" + companyName);
		System.out.println("Locatin of company =" + companyLocation);
	}  
	void EmpInfo(){
	
		System.out.println("Name of Employee = " + EmpName);
		System.out.println("Employee Salary = " + Empsalary);
		System.out.println("Employee ID = " + EmpId);

	}
}
class Employee{

	public static void main(String[] args){
	
		CompanyInfo obj = new CompanyInfo();

		obj.companyLocation();
		obj.EmpInfo();
	}
}
