//Take input from the user for jagged Array:
import java.io.*;
class Demo{
	
	public static void main(String[] a)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int [3][];

		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[1];
		
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
				
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		for(int x[] :arr){
			
			for(int y : x){
				
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
