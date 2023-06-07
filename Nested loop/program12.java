	// Pattern
	 	class Demo{
		
			public static void main(String[] a){
			
				int N =4;
				int T = 25;
				char ch = 'Z';
				
					for(int i= 1;i<=N;i++){
					
						for(int j=1;j<=4;j++){
						
							if(j%2==1){
							
								System.out.print(ch--);
							}else{
							
								System.out.print(T--);
							}
						}
						System.out.println();

					}
			}
		}
