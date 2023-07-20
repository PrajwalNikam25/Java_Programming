//prime number in Array:
import java.util.*;
class Demo{
        public static void main(String[] a ){
                Scanner sc =  new Scanner(System.in);
                System.out.println("Enter your size:");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter your numbers:");
                        for(int i=0;i<arr.length;i++){
                                arr[i]=sc.nextInt();
                        }
                        System.out.println(" prime numbers:");
                        for(int i=0;i<arr.length;i++){
                                int count=0;
                                for(int j=1;j<=arr[i];j++){
                                        if(arr[i]%j==0){
                                                count++;
                                        }
                                }
                                if(count==2){
                                        System.out.println(arr[i] + "Index of this number: " + i );
                                }
                        }
        }
}
    
