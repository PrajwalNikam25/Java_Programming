

class Demo{

	static void fun(int arr[]){
	
		int count =0;

		for(int i=0;i<arr.length;i++){
		
			 count =0 ;

			for(int j=0;j<arr.length;j++){
			
				if(arr[i]+arr[j]==-2){
				
					count++;
				}
			}
		}
		if(count!=0){
		
			System.out.println("yes");
		}else{
		
			System.out.println("No");
		}
	}

}
class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{0,4,5,6,7,3};

		Demo.fun(arr);
	}
}
