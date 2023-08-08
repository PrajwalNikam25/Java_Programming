import java.io.*;
import java.util.*;
import arithfun.Division;

class divClient{

	public static void main(String[] a)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		Division obj = new Division(x,y);

		System.out.println(obj.div());
	}
}
