
//Armstrong number in arrayL:
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
			for(int i=0;i<arr.length;i++){
				int temp = arr[i];
				int num = arr[i];
				int count=0;
				int mult=1;
				int sum=0;
				while(temp!=0){
					int rem = temp%10;
					count++;
					temp=temp/10;
				}while(num!=0){
					int rem= num%10;
				        mult=1;
					for(int j=1;j<=count;j++){
						mult=mult*rem;
					}
					sum = sum + mult;
					num = num/10;
				}
			                if(sum==arr[i]){
				        	System.out.println(arr[i] + " " + "Index is" + i);
					}
			}
	}
}
