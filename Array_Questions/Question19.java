class Demo{

	void fun(int arr1[],int arr2[],int arr3[]){

			int x =0;
			int c=0;
		for(int i=0;i<arr1.length;i++){

			for(int j=0;j<arr2.length;j++){
			
				if(arr1[i]==arr2[j]){
				
					x = arr1[i];
				}
				for(int t=0;t<arr3.length;t++){
				
					if(arr2[j]==arr3[t]){
					
						 c = arr1[i];
					}
				}
			}
				if(x==c){
				
					System.out.println(x);
				}
			}
		}

}
class Client{

	public static void main(String[] a){
	
		int arr1[] = new int[]{20,1,5,45,10,20,40,40};
		int arr2[] = new int[]{20,6,45,7,20,80,100};
		int arr3[] = new int[]{20,3,4,15,45,20,30,70,80,120};

		Demo obj = new Demo();

		obj.fun(arr1,arr2,arr3);

	}
}
