 
import java.net.*;
import java.io.*;

class SDemo{

	public static void main(String[] a)throws IOException{
	
		Socket s = new Socket("localhost",1300);

		InputStream is = s.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String str;

		while((str=br.readLine()) != null){
		
			System.out.println(str);
		}

		br.close();
		s.close();


	}
}
