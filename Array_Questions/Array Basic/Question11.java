


class Client{

	public static void main(String[] a){
	
		int arr1[] = new int[]{0,0,0,0};
		int arr2[] = new int[]{1,-1,2};
		
		int max = arr1[0];
		int min = arr2[0];

		for(int i=0;i<arr1.length;i++){
		
			if(arr1[i]>max){
			
				max=arr1[i];
			}
		}
		for(int i=0;i<arr2.length;i++){
		
			if(arr2[i]<min){
			
				min=arr2[i];
			}
		}

		System.out.println(max*min);

	}
}
