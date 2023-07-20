//Count of digits of number in Array:
import java.util.*;
class Demo{
	public static void main(String[] A){
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	System.out.println("Enter your number:");
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Count of digits of number in Array:");
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int rem=0;
			int count=0;
			while(temp!=0){
				rem=temp%10;
				count++;
				temp=temp/10;
			}
			System.out.print(count + " ");
		}
	}
}
