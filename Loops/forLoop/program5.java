	class demo{
		public static void main(String[] a){
		 	int N= 8;
			int count=0;
			for(int i=1;i<=6;i++){
				if(N%i==0){
					count= count + 1;
				}
			}System.out.println(count);
		}
	}
