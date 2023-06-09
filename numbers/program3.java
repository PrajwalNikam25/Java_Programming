//This is armstrong number.
class demo{
		public static void main(String[] a){
			int N =7658;
			int X=N;
			int count=0;
			int T=N;
			int sum=0;
				while(N!=0){
					count++;
					N=N/10;
				}while(X!=0){
					int rem = X%10;
					int mult=1;
					for(int i=1; i<=count;i++){
						mult=mult*rem;
					}sum=sum+mult;
					X=X/10;
				}if(T==sum){
					System.out.println("it is armstrong number");
				}else{
					System.out.println("it is not a armstrong number");
				}
		
		}
	}

