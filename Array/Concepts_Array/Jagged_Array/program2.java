// 2 method of initialization of jagged array:
class Demo{
	
	public static void main(String[] a){
		
		int arr[][] = new int [3][];

		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{1,2};
		arr[2] = new int[]{1};

		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
