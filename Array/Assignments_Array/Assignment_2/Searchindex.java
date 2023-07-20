//search number index is:
import java.io.*;
class Demo{
        public static void main(String[] a)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int arr[] = new int[7];
                int count=0;
                int count1=0;
                System.out.println("Enter your numbers:");
                for(int i = 0;i<arr.length;i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
		System.out.println("Enter your search number:");
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println("search number index is:" + i );
			}
		}
	}
}
