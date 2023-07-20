//passing Array as an Argument:
class Demo{
	void fun(int arr[]){

		for(int x : arr){

			System.out.println(x);
		}
		arr[2]=45;
		arr[3]=75;
	}
		public static void main(String[] a){

			int arr[] = {10,20,30,40};
				
			Demo obj = new Demo();

			obj.fun(arr);

			for(int x : arr){
				System.out.println(x);
			}
			
			
		}


	
}
