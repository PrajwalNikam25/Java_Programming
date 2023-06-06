//BufferedReader:
import java.io.*;
class Demo{

		public static void main(String[] a)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter player Name:");
				String Name = br . readLine();
				System.out.println("Enter player jourssy No:");
				int jrsNo = Integer.parseInt(br.readLine());
				System.out.println("Enter batting Avarage:");
				float Avg = Float.parseFloat(br.readLine());
					System.out.println(Name);
					System.out.println(jrsNo);
					System.out.println(Avg);
				
		}
	}
