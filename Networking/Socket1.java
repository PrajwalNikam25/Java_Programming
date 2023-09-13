// Server Socket:


import java.net.*;
import java.io.*;

class Demo1{

	public static void main(String[] a)throws IOException{
	
		ServerSocket ss = new ServerSocket(1200);

		Socket s = ss.accept();

		System.out.println("Connection ok");

		OutputStream os = s.getOutputStream();

		PrintStream ps = new PrintStream(os);

		ps.println("Hello Client");
		ps.println("Well-Come");

		ps.close();
		s.close();
		ss.close();

	}
}
