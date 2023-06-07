 	//Pattern
		class Demo{
		
			public static void main(String[] a){
			
				
				
					for(int i=1;i<=4;i++){
						char ch ='A';
						int T=1;
						for(int j=1;j<=4;j++){
					
						if(j%2==1){
						
							System.out.print(ch++ + "  ");
						}else{
						
							System.out.print(T++ + "  ");
						}
						}
						System.out.println();
					}
			} 
		}
