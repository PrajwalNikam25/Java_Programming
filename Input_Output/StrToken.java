	//StringTokenizer
	import java.util.*;
	import java.io.*;
	class Demo{
		public static void main(String[] A)throws IOException{
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Socity name, wing , flat no ");
				String info = br.readLine();
				
				StringTokenizer obj = new StringTokenizer(info," ");
				
				String Token1 = obj.nextToken();
				String Token2 = obj.nextToken();
				String Token3 = obj.nextToken();
					System.out.println("Socity name=" + Token1);
					System.out.println("Wing=" + Token2);
					System.out.println("flat no=" + Token3);
		}
	}
