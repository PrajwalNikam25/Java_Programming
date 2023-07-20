// multiplication of even numbers;
import java.util.*;
class Demo{
        public static void main(String[] a){
                Scanner sc =  new Scanner(System.in);
                System.out.println("Enter the size of array:");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter your numbers:");
                int mult=1;
                        for(int i=0;i<arr.length;i++){
                                arr[i] = sc.nextInt();
                                if(arr[i]%2==0){
                                        mult = mult * arr[i];
                                }
                        }
                                System.out.println("mult of even number in array:" + mult);
        }
}

