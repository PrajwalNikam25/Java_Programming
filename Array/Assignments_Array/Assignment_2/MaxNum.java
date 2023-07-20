//maximum  numbar in Array:
import java.io.*;
class Demo{
        public static void main(String[] a)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int arr[] = new int[7];
                int max=0;
                System.out.println("Enter your numbers:");
                for(int i = 0;i<arr.length;i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
                max=arr[0];
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                System.out.println("The max value in array is:" + max);
        }
}


