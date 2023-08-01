// Create Usre Define Exception:

import java.util.*;

class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String str){
	
		super(str);
	}
}
class DataUnderFlowException extends RuntimeException{

	DataUnderFlowException(String str){
	
		super(str);
	}
}
class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		for(int i =0;i<5;i++){
		
			int data = sc.nextInt();
		
			if(data<0){
			
				throw new DataUnderFlowException("Please Enter Greater Number");
			}
			if(data>100){
			
				throw new DataOverFlowException("Please Enter Small Number");
			}
			arr[i] = data;
			
		}
	}
}
