// Totle of Digites is even then print it:
import java .util.*;
class Demo{
	public static void main(String[] main){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr array size:");
		int num = sc. nextInt();
		int arr[] = new int[num];
		System.out.println("Enter your number:");
		
		
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}System.out.println("Even numbers in Array:");
			for(int i = 0;i<arr.length;i++){
			
				int sum = 0;	
				int temp = arr[i];
				while(temp!=0){
					int rem = temp%10;
					sum = sum + rem;
					temp= temp/10;
				}
				if(sum%2==0){
					System.out.println(arr[i]);
				}
			}
			
	}
}
