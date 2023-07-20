import java.util.*;
class Demo{

	public static void main(String[] a){
	
		int arr[] ={10,20,30,10,40,50};

		int arr2[] ={6};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your number:");

		int num = sc .nextInt();

		int count=0;

			for(int i=0;i<arr.length;i++){
			
				for(int j=0;j<arr.length;j++){
				
					if(arr[i]==arr[j]){
					
						count++;
					} 
				}
				arr2[i] = count;
			}
			for(int i =0;i<arr2.length;i++){
			
				System.out.println(arr2[i]);
			}
		
	}
}
