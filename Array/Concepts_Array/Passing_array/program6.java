//Passing Array as an agrument:
class Demo{

	void fun(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]+50;
		}
	}

		public static void main(String[] a){
		
			int arr[] ={100,200,300,400};
			
			for(int x : arr){
				System.out.println(x);
			}

			Demo obj = new Demo();

			obj.fun(arr);
			
			for(int x : arr){
				System.out.println(x);
			}
		}
		

}
