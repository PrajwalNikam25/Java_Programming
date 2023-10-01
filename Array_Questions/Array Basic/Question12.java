


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,3,3,4,3,5};

		int n = 5;

		int count = 0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]==n){
			
				System.out.println("First Index = " + i);

				break;
			}
			if(n!=arr[i]){
			
				count++;
			}
		}
		for(int i=arr.length-1;i>=0;i--){
		
			if(arr[i]==n){
			
				System.out.println("Last Index = " + i);

				break;
			}
		}
		if(count==arr.length){
		
			System.out.println("-1");
		}
	}
}
