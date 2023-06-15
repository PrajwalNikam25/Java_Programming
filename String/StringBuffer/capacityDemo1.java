// Capacity of the String
// formula for the Capacity increasing(current capacity + 1 * 2)


class Demo {

	public static void main(String[] arg){
	
		StringBuffer str1 = new StringBuffer();
		
		System.out.println(str1.capacity());

		str1.append("Prajwal");

		System.out.println(str1.capacity());

		str1.append("NiakmCore2web");
		
		System.out.println(str1.capacity());
	}
}
