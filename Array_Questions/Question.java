// Question No.8:
//
// Replace 0's By 5

class Client{

	public static void main(String[] a){
	
		int num = 121;

		int T=0;
		int K=0;

		while(num !=0){
		
			int rem = num%10;

			if(rem == 0){
			
				rem =5;
			}
		        T = T*10+rem;

			num = num/10;
		}
		while(T!=0){
		
			int rem = T%10;

			K = K*10+rem;

			T = T/10;
		}

		System.out.println(K);
		
	}
}
