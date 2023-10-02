


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int N = arr.length;

		for(int i=0;i<N%2;i++){
		
			for(int j = N-1;j>=0;j--){
			
				arr[i]=arr[j];
				break;
			}
		}
		for(int i=0;i<N;i++){
		
			System.out.println(arr[i]);
		}
	}
}
