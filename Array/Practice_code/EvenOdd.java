//Enter the number in array is even or odd ; 
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
	int arr[]=new int[4];	
	BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<4;i++){
		 arr[i]=Integer.parseInt(br.readLine());
	}for(int i=0;i<4;i++){
		if(arr[i] % 2==0){
			System.out.println("Even numbers:" + arr[i]);
		}else{
			System.out.println("Odd numbers:" + arr[i]);
		}
	}
	
	}
}
