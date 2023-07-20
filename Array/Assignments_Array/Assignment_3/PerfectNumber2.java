// print the perfect number in an Array:

import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr your Array Size:");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter tour numbers:");
			for(int i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i<arr.length;i++){
				int temp=arr[i];
				int rem=0;
				int num=0;
				while(temp!=0){
					rem=temp%10;
					num=num*10+rem;
					temp=temp/10;
				}
				if(num==arr[i]){
					System.out.println(arr[i] + " " + "Index is " + i);
				}
			}
	}
}
