//prime number code 
class demo{
	
		public static void main(String[] p){
		
			int N = 1;
			int count=0;
			for(int i=1;i<=N;i++){

				if(N%i==0){

					count++;
					
				}
				}if(count==2){
					System.out.println("it is the prime number");
				}else{
					System.out.println("it is not a prime number");
				}
			}
		}
	
