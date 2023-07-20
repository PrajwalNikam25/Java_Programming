//Multiplication of odd Number in array:
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
                int arr[] = new int[size];
		System.out.println("Enter the elements in array:");
		int mult=1;
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
					if(i%2==1){
						mult=mult * arr[i];
					}
			}System.out.println("The mult of aoo odd index in Array:" + mult);
	}
}
