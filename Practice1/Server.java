
import java.net.*;
import java.io.*;

class Demo{

	public static void main(String[] a)throws IOException{

	ServerSocket ss = new ServerSocket(1001);

	Socket s = ss.accept();

	System.out.println("Connection Ok");

	OutputStream os = s.getOutputStream();

	PrintStream ps = new PrintStream(os);

	ps.println("Hello");
	ps.println("Client");

	ps.close();
	s.close();
	ss.close();
}
}

