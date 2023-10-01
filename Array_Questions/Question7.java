// Question No.7:

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4};

		int x = 1;

		for(int i = 0;i<arr.length;i++){
		
			x = arr[i]*x;
		}
		System.out.println(x);
	}
}
