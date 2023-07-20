//sum of number in Array:
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[]= new int[5];
		int sum = 0;
		for(int i=0;i < arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}
		System.out.println("Sum of array elements : " + sum);
		
		
	}
}
