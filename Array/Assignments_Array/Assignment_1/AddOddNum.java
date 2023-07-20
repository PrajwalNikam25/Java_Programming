//addition of the odd numbers;
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
	        System.out.println("Enter your numbers:");
		int sum=0;
       			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
				if(arr[i]%2==1){
					sum = sum + arr[i];
				}
			}
				System.out.println("Sum of odd number in array:" + sum);
	}
}
