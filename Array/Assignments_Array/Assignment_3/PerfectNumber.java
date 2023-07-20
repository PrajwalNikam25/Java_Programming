//perfect numbers in array:
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array Size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your Array Element:");
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++){
				int count =0;
				int sum = 0;
				for(int j=1;j<arr[i];j++){
					if(arr[i]%j==0){
						sum = sum+j;
					}
				}
				if(sum==arr[i]){
					System.out.println(arr[i] + "Index is" + i);
				}
			}
	}
}
