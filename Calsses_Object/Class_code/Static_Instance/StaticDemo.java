// Difference Between instances and Static variable

class Employee{

	int empId = 25;

	String Name = "Prajwal";

	static int salary = 10000;

	void empInfo(){
	
		System.out.println(empId);
		System.out.println(Name);
		System.out.println(salary);
	}
}
class empdata{

	public static void main(String[] args){
	
		Employee emp =new Employee();
		Employee emp1 =new Employee();

		emp.empInfo();
		emp1.empInfo();

		System.out.println("----------------------------------------");
		emp1.empId=45;
		emp1.Name="Rohit";
		emp1.salary=20000;

		emp.empInfo();
		emp1.empInfo();

	}
}
