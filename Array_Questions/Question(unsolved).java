


class Demo{

	void fun(int arr[]){

		int count=0;
	
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				if(arr[j]==arr[i]){
				
					count++;
				}
			}
			if(count==3){
			
				System.out.println(arr[i]);
			}
		}
	}
}
class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,1,1,2,2};
	
		Demo obj = new Demo();

		obj.fun(arr);


	}
}

