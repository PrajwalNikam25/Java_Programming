//
class Demo{

	public static void main(String[] a){
	
		String str1 = "prajwal";
		String str2 = "Nikam";
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
