	class patten{
	 	public static void main(String[] a){
			int N=4;
			int T=1;
				for(int i=1;i<=N;i++){
					for(int j=1;j<=N-i+1;j++){
						System.out.print(T++);
					}
					T=T-1;
					System.out.println();
				
				}
		}
	}
