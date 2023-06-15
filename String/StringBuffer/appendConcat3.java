//Append Show the Result After method Applying there is no need to Strore
//But in concat case we need to store the result of method 

class Demo{

	public static void main(String[] a){
	
		String str1 = "Prajwal";
		String str2 = new String("Nikam");
		StringBuffer str3 = new StringBuffer("Core2web");

		str1.concat(str2);  //String str4 = str1.concat(str2);
		str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
