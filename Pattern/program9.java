//J%2==1
//square triangle
class pattern{
		public static void main(String[] a){
			int N=4;
			int T=1;
			for(int i=1;i<=N;i++){
				for(int j=1;j<=N-i+1;j++){
					if(j%2==1){
						System.out.print(T + " ");
					}else{
						System.out.print(T*T + " ");
					}
					T++;
				
				}
				System.out.println();

			}

		}
	}
