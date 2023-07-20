// Take a input from the user for the array;
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
		int arry[]=new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		for(int i=0;i<4;i++){
		 	arry[i]=Integer.parseInt(br.readLine());
		}
		for(int j=0;j<4;j++){
			System.out.println(arry[j]);			
		}	
		
		
	
	}
}
