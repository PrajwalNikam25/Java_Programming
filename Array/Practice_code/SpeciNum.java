//Print only number divided by the 5;
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Arry:");
		int size= sc.nextInt();
		int arry[]=new int[size];
		System.out.println("Enter your number:");
		for(int i=0;i<arry.length;i++){
			arry[i]=sc.nextInt();
		}

		System.out.println("Numbers They divided by 5:");
		for(int i=0;i<arry.length;i++){
			if(arry[i]%5==0){
				System.out.println( arry[i]);
			}
		}
	}
}
