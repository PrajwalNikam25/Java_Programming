//Number Divided by 5:
import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the element of the array:");
			for(int i=0;i<arr.length;i++){
				arr[i] = Integer.parseInt(br.readLine());
			}
			System.out.println("number are divisibale by 5:");
			for(int i=0;i<arr.length;i++)		
				if(arr[i]%5==0){
					System.out.println(arr[i]);
				}
			}
	}

