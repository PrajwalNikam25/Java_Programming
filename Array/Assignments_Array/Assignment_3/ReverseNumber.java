//reverse number in Array:
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rray size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the element in the Array:");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++){
				int rem=0;
				int num =0;
				while(arr[i]!=0){
					rem=arr[i]%10;
					num=num*10+rem;
					arr[i]=arr[i]/10;
				}
				System.out.println(num);
			}

	}
}
