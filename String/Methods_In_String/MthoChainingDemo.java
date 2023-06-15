// Method Chaining :

class Demo{

	public static void main(String[] args){
	
		String str1 = "PrajwalNikam";

		StringBuffer sb = new StringBuffer(str1);

	        str1 = sb.reverse().toString(); //toString Method is use for the convert the  StringBuffer into String

		System.out.println(str1);
	}
}
