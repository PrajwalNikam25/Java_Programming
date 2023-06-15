// Append Method Working:

class Demo{

        public static void main(String[] a){

                String str1 = "Prajwal";
                String str2 = new String("Nikam");
                StringBuffer str3 = new StringBuffer("Core2web");

                StringBuffer str4 = str3.append(str1);  //(Append Method returns a StringBuffer Therefore initialise String by StringBuffer:)
							//(Append Method internally call new StringBuffer)
		
		String str5 = str1.concat(str1);

                System.out.println(str1);
                System.out.println(str2);
                System.out.println(str3);
                System.out.println(str4);
                System.out.println(str5);
        }
}


