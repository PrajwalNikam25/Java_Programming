//cout of odd numbers in arry;
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of array:");
	int size = Integer.parseInt(br.readLine());
	int arry[] = new int[size];
	System.out.println("Enter your number:");
	int sum=0;
		for(int i=0;i<arry.length;i++){	
			 arry[i] = Integer.parseInt(br.readLine());
		}for(int i= 0;i<arry.length;i++){
			if(arry[i]%2==1){
				sum=sum+arry[i];
			}
		}
		System.out.println("Totle of all odd numbers in arry is=" + sum);
	}
}
