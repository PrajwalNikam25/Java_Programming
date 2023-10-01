

class Demo{

	void fun(int arr[]){
	
		int count =0;

		int arr2[] = new int[arr.length];

		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				if(arr[i]==arr[j]){
				
					count++;
				}
				void gun(){
				
					
				}
			}

			arr2[i] = count;
			
			count=0;
		}
		int max = arr2[0];
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max = arr[i];
			}
		}
		System.out.println(max);

		gun();
		
	}
}
class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,1,1,1};

		Demo obj = new Demo();

		obj.fun(arr);
	}
}
