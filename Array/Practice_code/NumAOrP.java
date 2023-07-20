//Find numabr is present in Array or Not
import java.util.*;
class Demo{

	public static void main(String[] a){
	
		int arr[]={10,11,12,13,12,15};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number:");

		int num = sc.nextInt();

			for(int i=0;i<arr.length;i++){
			
				if(num==arr[i]){

					System.out.println("This number is present in Array" + " " + "At index" + " " + i);
					break;
				}
			}
			int count=0;
			for(int i=0;i<arr.length;i++){
			
				if(num == arr[i]){
					count++;
				}
			}
			if(count==0){
				System.out.println("This numabr is not present in Array");
			}
	}
}
