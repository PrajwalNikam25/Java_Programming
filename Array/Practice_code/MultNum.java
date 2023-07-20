//Multipicatiuon of number in Array:
import java.io.*;
class Demo{
        public static void main(String[] a)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int arr[]= new int[5];
                int mult = 1;
                for(int i=0;i < arr.length; i++){
                        arr[i]=Integer.parseInt(br.readLine());
                        mult = mult * arr[i];
                }
                System.out.println("Multiplication of array elements : " + mult);


        }
}
            
