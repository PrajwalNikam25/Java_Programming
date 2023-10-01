  



class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{4,-3,3,-5};

		int sum = 0;

		for(int i=0;i<arr.length;i++){
		
			sum = sum+arr[i];
		}
		System.out.println(sum);

		if(sum%2==1){
		
			System.out.println("aa");
		}
	}
}
