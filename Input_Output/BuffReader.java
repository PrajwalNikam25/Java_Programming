//BufferedReader:
import java.io.*;	
class Demo{
		
			public static void main(String[] a)throws IOException{
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("enter name");
					String name = br.readLine();
					System.out.println(name);
			}
		}
