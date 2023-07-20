class Demo{

	void fun(int arr[]){
	
		System.out.println("In fun call:");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
	
	arr[0]=10+20;
	arr[1]=20+20;
	}


	public static void main(String[] args){
		
		int arr[] = {10,20,30,40};
		System.out.println("befor fun call:");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		Demo obj = new Demo();
		obj.fun(arr);

		System.out.println("After fun call:");

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
	}
}

