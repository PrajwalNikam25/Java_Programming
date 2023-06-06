//StringTokenizer:
  	import java.io.*;
	import java.util.*;
		class Demo{
			public static void main(String[] A)throws IOException{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter mall name,brand,location ");
					String info = br.readLine();

					System.out.println(info);
					StringTokenizer obj = new StringTokenizer(info , ",");

					String token1 = obj.nextToken();
				        String token2= obj.nextToken();
					String token3 = obj.nextToken();
						
						System.out.println(" mall name =  " + token1);
						System.out.println(" brand = " + token2);
						System.out.println(" location = " + token3);	

				
			
			}
		}
