//Squares in triangle pattern
class pattern{
		public static void main(String[] a){
			int N=1;
			for(int i=1;i<=4;i++){
				for(int j=1;j<=i;j++){
					System.out.print(N*N + " ");
					N++;
				}
				
				System.out.println();
			}
		}
	}
