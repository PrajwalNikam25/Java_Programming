//BuffeeredReader:
import java.util.*;
import java.io.*;
class Demo{
		static void add(int a,int b){
			int sum=a+b;
			System.out.println("Sum="+ sum);
		}
		public static void main(String[] a)throws IOException{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter your name:");
				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());
				add(x,y);
		}
	}
