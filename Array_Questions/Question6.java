// Question No.6;


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,0,3,2,4,5};

		int min = arr[0];

		for(int i = 0; i<arr.length;i++){
		
			if(arr[i]<min){
			
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
