// ArithmeticException Handling:

import java.util.*;

class Demo{

	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		try{
			System.out.println(10/x);
		}catch(ArithmeticException ae){
		
			System.out.println("Please Enter Non-zero Number:");
		}
	}
}
