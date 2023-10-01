// Question No.4;



class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,345,234,21,5678};

		int min = arr[0];

		for(int i = 0;i<arr.length;i++){
		
			if(arr[i]<min){
			
				min = arr[i];
			}
		}
		int max = arr[0];

		for(int i = 0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
