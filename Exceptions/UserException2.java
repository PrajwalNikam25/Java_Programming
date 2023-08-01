// RealTime Example of User Define Exception:


import java.util.*;


class UnderAgeException extends RuntimeException{

	UnderAgeException(String str){
	
		super(str);
	}
}
class OverAgeException extends RuntimeException{

	OverAgeException(String str){
	
		super(str);
	}
}
class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age");

		int age = sc.nextInt();

		if(age<18){
		
			throw new UnderAgeException("Your Under Age:");
		}
		if(age>45){
		
			throw new OverAgeException("Your Over Age:");
		}else{
		
			System.out.println("Well-Come in Gym world ");
		}
	}
}
