//Product of even numbers in array;
import java.io.*;
class Demo{
	public static void main(String[] a)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arry");
		int size = Integer.parseInt(br.readLine());
		int arry[]=new int[size];
		System.out.println("Enter your number:");
		int mult=1;
			for(int i = 0;i<arry.length;i++){
				arry[i]=Integer.parseInt(br.readLine());
			}for(int i=0;i<arry.length;i++){
				if(arry[i]%2==0){
					mult=mult*arry[i];
				}
			}
			System.out.println("Product of even numbers in arry= " + mult);
	}
}
