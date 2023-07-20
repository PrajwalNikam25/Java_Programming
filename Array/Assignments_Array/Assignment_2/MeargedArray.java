//Mearged Array:
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[2];
		int arr2[] = new int[3];
		int arr3[] = new int[5];
		int itr = 0;
		System.out.println("Enter the element or arr1:");
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();
			arr3[itr] = arr1[i];
			itr++;
		}
		System.out.println("Enter the element or arr2:");
		for(int i=0;i<arr2.length;i++){
			arr2[i] = sc.nextInt();
			arr3[itr] = arr2[i];
			itr++;
		}
		System.out.println("Mearged array :");

		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}	

		}
}


