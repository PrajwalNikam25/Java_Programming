// URLConnection class:


import java.io.*;
import java.net.*;

class Demo{

	public static void main(String[] s){
	
		URL obj = new URL("www.youtube.com");

		URLConnection uk = obj.openConnection();

		System.out.println("Last UPdate" + new Date());
	}
}
