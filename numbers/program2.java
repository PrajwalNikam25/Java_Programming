// perfect number
class demo{
	
		public static void main(String[] a){
		
			int N = 8128;
			int sum=0;

			for(int i=1;i<=N;i++){
			
			if(N%i==0){
				sum=sum+i;
			}
			}if(sum-N==N){
				System.out.println("it is perfect number");
			 }else{
			 	System.out.println("it is not perfect number");
			 }
				
		}
	}
