//Strong number:
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enetr array element:");
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println("Strong number in Array:");
			for(int i=0;i<arr.length;i++){
				int temp=arr[i];
				int sum=0;
				int rem;
				int mult=1;
				while(temp!=0){
					rem = temp%10;
					for(int j=1;j<=rem;j++){
						mult=mult*j;
					}
					sum =sum+mult;
					temp=temp/10;
					mult=1;
			        }
				if(sum==arr[i]){
					System.out.println(arr[i] + " " + "Index is " + i );
				}
		}
	}
}
