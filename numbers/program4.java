//composite number.
class demo{
		public static void main(String[] a){
			int N = 1;
			int i=1;
			int count=0;
			for(i=1;i<=N;i++){
				if(N%i==0){
					count++;
				}	
				}if(count>=3){
					System.out.println("this is composite number");
				}else{
					System.out.println("this is not composite number");
				}
		}
	}
