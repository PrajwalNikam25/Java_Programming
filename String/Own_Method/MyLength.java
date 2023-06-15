// My Length Methode:
import java.util.*;
class Demo{

	static int myStrLen(String str){
		
		char arr[] = str.toCharArray();

		int count=0;

		for(int i=0; i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter str1:");
		String str1 = sc.next();
		System.out.println("Enter str2:");
		String str2 = sc.next();
			
			if(myStrLen(str1)==myStrLen(str2)){
				System.out.println("Equal String");
			}
			else{
				System.out.println("Not Equal String");
			}
	}
}
