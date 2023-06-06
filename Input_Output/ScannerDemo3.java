//Scanner
import java.util.*;
class InputOutput{
	
		public static void main(String[] a){
			Scanner obj = new Scanner(System.in);
				System.out.println("Enter Dream company:");
				String company = obj.next();
				System.out.println("Enter Expected Salary:");
				int Salary = obj.nextInt();
				System.out.println("Enter Avarage Package:");
				float Package = obj.nextFloat();
			System.out.println("Information about employee");
				System.out.println(company);
				System.out.println(Salary);
				System.out.println(Package);	
		}
	}
