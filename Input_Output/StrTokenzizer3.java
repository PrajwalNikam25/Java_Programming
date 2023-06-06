	//StringTokenizer
	import java.util.*;
	import java.io.*;
	class Demo{
		public static void main(String[] A)throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Socity name, wing , flat no ");
				String info = br. readLine();
				StringTokenizer obj = new StringTokenizer(info," ");
				String token1 = obj.nextToken();
				String token2 = obj.nextToken();
				String token3 = obj.nextToken();
					System.out.println("Socity name=" + token1);
					System.out.println("Wing=" + token2);
					System.out.println("flat no=" + token3);
		}
	}
