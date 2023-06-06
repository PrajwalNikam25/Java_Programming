//scanner
import java.util.Scanner;
class input{
		public static void main(String[] a){
			Scanner obj = new Scanner(System.in);
				System.out.println("Enter your Name:");
				String name= obj.next();
					System.out.println("Enter Birth Date:");
					int date  = obj.nextInt();
					System.out.println("lucky number:");
					float no = obj.nextFloat();
			System.out.println(name);
			System.out.println(date);
			System.out.println(no);
		}
	}
