// How Array Stored on Heap Section:
class Demo{
	public static void main(String[] a){
		int arr[][] = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(arr[0][0]);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr);
	}
}

