// Socket:


import java.io.*;
import java.net.*;

class Demo2{

	public static void main(String[] a)throws IOException{
	
		Socket s = new Socket("localhost",1200);

		InputStream ip = s.getInputStream();

		BufferedReader br = new BufferedReader(new InputStreamReader(ip));

		String str;

		while((str=br.readLine()) != null){
		
			System.out.println(str);
		}
		br.close();
		s.close();
	}
}
