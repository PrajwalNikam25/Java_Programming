//scanner
import java.util.Scanner;
class input{
		public static void main(String[] a){
			Scanner obj = new Scanner(System.in);
				System.out.println("Enter player Name:");
				String Name = obj.next();
				System.out.println("Enter Jourssy No:");
				int No= obj.nextInt();
				System.out.println("Enter Batting avarage:");
				float Avarage = obj.nextFloat();
			        System.out.println("Enter Player Age:");
		                int Age = obj.nextInt();
		 System.out.println("Information of the Player");
 			System.out.println(Name);
       			System.out.println(No);
			System.out.println(Avarage);
			System.out.println(Age);			
		}
	}
