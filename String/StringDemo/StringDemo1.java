//String run on JVM:

class Demo{
	public static void main(String[] a){
		String str1 = "Prajwal";
		String str2 = "Prajwal";
		String str3 = new String("Prajwal");
		String str4 = new String("Prajwal");
		String str5 = new String("Vaibhav");
	

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str5));
		
	}
}
