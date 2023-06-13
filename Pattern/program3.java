//Pattern of  
//1
//23
//456
//78910
class pattern {
		public static void main(String[] a){
			int N =1;
			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					System.out.print(N++ + " ");
				}
				System.out.println();
			}
		}
	}
