	class demo{
		public static void main(String[] a){
			int N=25;
			int mult=1;
			int count=0;
			while(N!=0){
				int rem=N%10;
				int K =rem;
					for( K=rem;K>=1;K--){
						mult=mult*K;
					}count=count+mult;
					N=N/10;
			}
			System.out.println(count);
			 
		}
	}
