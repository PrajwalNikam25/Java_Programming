class Demo{

	void fun(int arr[]){

		for(int i=0;i<arr.length;i++){
		
			int sum =0; 

			for(int j=i;j<arr.length;j++){
			
				sum = sum + arr[j];

				if(sum==7){
				
					System.out.println("Start" + i + "End" + j);
				}
			}
		}
	}

}
class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,4,0,0,3,10,5};

		Demo  obj = new Demo();

		obj.fun(arr);

	}
}
