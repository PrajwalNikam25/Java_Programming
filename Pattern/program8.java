//char++
//in++
//pattern 
class pattern{
		public static void main(String[] a){
			char ch = 'A';
			int N=1;
			int T=4;
				for(int i=1;i<=T;i++){
					for(int j=1;j<=T-i+1;j++){
						if(j%2==1){
						System.out.print(ch++ + " ");
						}else{
						System.out.print(N++ + " ");
						}
					}
					System.out.println();
				}
		}
	}
