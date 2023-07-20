//count of even number and odd number in Array:
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
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2==1){
				count++;
			}
			
			if(arr[i]%2==0){
				count1++;
			}
		}
		System.out.println("Count of even number:" + count);
		System.out.println("Count of even number:" + count1);
	}
}
