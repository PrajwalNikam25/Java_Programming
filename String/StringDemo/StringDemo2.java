//String run on JVM:

class Demo{
	public static void main(String[] a){
		String str1 = "Prajwal";
		String str2 = str1;
		String str3 = new String(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
