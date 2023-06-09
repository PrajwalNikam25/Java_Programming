	class demo{
		public static void main(String[] a){
			int N=145;
			int T = N;
			int count=0;
			int mult=1;
			int rem=0;
			int K=0;
				while(N!=0){
					rem=N%10;
					 K=rem;

					for( K=rem;K>=1 ;K--){

						mult=mult*K;

					}count=count+mult;

					N=N/10;
				}	
					if(count==T){
						System.out.println("This is a strong number");
					}else{
					
						System.out.println(count);
					}
		}
	}
