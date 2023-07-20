import java.util.*;
class  Demo{

	public static void main(String[] Args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size of Array:");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
		
			arr[i]=sc.nextInt();
		}
	}
}
