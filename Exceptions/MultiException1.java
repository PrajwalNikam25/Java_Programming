// Handle Multiple Exception by try Catch:

import java.io.*;
class Client{

	public static void main(String[] a)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0;
		try{
		       	x = Integer.parseInt(br.readLine());

		        System.out.println(10/x);
		}catch(NumberFormatException obj){
		
			System.out.println("Please Enter Valid Data");
		}catch(ArithmeticException ae){
		
			System.out.println("Please Enter Non-Zero Value");
		}catch(Exception e){
		
			System.out.println("Exception is Present");
		}

	}
}
