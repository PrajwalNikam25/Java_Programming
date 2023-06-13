	class pattern{
		public static void main(String[] a){
			int N=5;
			int T=1;
				for(int i=1;i<=N;i++){
					for(int j=1;j<=i;j++){
						System.out.print(T++ + " ");
					}
					T=T+1;
					System.out.println();
				}
		}
	}
