//fine Second maximum number in array:
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
			int max2=arr[0];
			int max = arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[0]>max){
					max=arr[i];
				}
				for(int j=0;j<arr.length;j++){
					if(max!=arr[i]){
					        if (arr[i]>max2){
							max2=arr[i];
						}
					}
				}
	
	}
	System.out.println( max2);
}
}

