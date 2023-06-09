//Automorphic number.
class demo{
		public static void main(String[] main){
			int N =25;
			int T = N*N;
			int baki=0;
			int count=0;
			int sum=0;
			int num=0;
				while(N!=0){
					int rem=N%10;
					 num=num*10+rem;
					count++;
					N=N/10;
				}
					for(int i=1;i<=count;i++){
					 baki = T%10;
					 sum=sum*10+baki;
					 T=T/10;
					}
				
			        
				if(sum==num){
				
				System.out.println("it is automorphic number");
				}else{
					System.out.println("it is not automorphic number");
				}
		}
	}
