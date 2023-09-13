// IP Address:

import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] a)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String site = br.readLine();

		InetAddress ip = InetAddress.getByName(site);

		System.out.println("IP Address = " + ip);
	}
}
