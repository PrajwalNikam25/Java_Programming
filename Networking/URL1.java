// URL:


import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] a)throws MalformedURLException{
	
		URL u = new URL("https://www.youtube.com");

		System.out.println(u.getProtocol());
		System.out.println(u.getPort());
		System.out.println(u.getFile());
	}
}
