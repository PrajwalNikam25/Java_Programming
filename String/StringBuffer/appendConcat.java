// Differnece Between Append And Concat
// Append is use for the StringBuffer(For the Append method we can use both type of parameter String ,StrinBuffer) 
// Concat is only use for String(For concat method we can use only String type Parameter)
// Append is more Powerfull then the Concat
class Demo{

        public static void main(String[] a){

                String str1 = "Prajwal";
                String str2 = new String("Nikam");
                StringBuffer str3 = new StringBuffer("Core2web");

                String str4 = str1.concat(str1);  // We can not use append Method instade of concat if There is a String is Present:

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
        }
}

