//count of digits of number in Array:
import java.util.*;
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size:");
		int size=Integer.parseInt(br.readLine());
		String arr[] = new String[size];
		System.out.println("Enter your number:");
		for(int i=0;i<arr.length;i++){
			arr[i]=br.readLine();
		}
		for(int i=0;i<arr.length;i++){
			String str=arr[i];
			System.out.println(str.length());

		}
	}
}
