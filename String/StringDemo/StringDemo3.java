// Append method in String '+':
 
class Demo{
	public static void main(String[] a){
		String str1 = "Prajwal";
		String str2 = "Nikam";
		String str3 = "PrajwalNikam";
		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}
	
}
