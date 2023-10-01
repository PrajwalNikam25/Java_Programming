// Question No.1:

import java.util.*;

class Demo{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Search Number:");

		int x = sc.nextInt();

		int arr[] = new int[4];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		for(int i=0;i<arr.length;i++){
			
			if(x == arr[i]){
			
				System.out.println("Index =" + i);
			}
		}
	}
}
