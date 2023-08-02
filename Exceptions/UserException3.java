// User Define Exception:

import java.util.*;

class LessMarksException extends RuntimeException{

	LessMarksException(String str){
	
		super(str);
	}
}
class MoreMarksException extends RuntimeException{

	MoreMarksException(String str){
	
		super(str);
	}
}
class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Marks");

		int arr[] = new int[5];

		for(int i =0;i<5;i++){

			int Marks = sc.nextInt();
			
			if(Marks<35){
			
				throw new LessMarksException("You are not Qualify:");
			}
			if(Marks>75){
			
				throw new MoreMarksException("You are Qualify:");
			}
			arr[i]=Marks;

		}
	}
}
