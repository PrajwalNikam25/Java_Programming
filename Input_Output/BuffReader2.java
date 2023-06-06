// br.close();
import java.io.*;
class Demo{
		public static void main(String[] a)throws IOException{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str1 = br1.readLine();
				System.out.println(str1);
				br1.close();
				String str2 = br2.readLine();
				System.out.println(str2);
		}
	}
