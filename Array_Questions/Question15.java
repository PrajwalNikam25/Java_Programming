

class Demo{

	void fun(int arr[]){
	
		int arr2[] = new int[];
		int sum = 0 ;

		for(int i = 0;i<arr.length;i++){
		
			sum = sum + arr[i];

			if(sum<=33){

				arr2[i]=arr[i];
			}
	
		}
		for(i=0;i<arr2.length;i++){
		
			System.out.println(arr2[i]);
		}
	}
}
class Client{

	public static void main(String[] a){
	
		int arr[]  = new int[]{1,4,20,3,10,5};

		Demo obj = new Demo();

		obj.fun(arr);
	}
}
