// Initial Capacity:


class Demo{

	public static void main(String[] args){
	
		StringBuffer str1 = new StringBuffer(100);

		System.out.println(str1.capacity());
		
		str1.append("My Name is Prajwal");

		System.out.println(str1);

		System.out.println(str1.capacity());
	}
}
