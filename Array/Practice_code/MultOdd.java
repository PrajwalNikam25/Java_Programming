//Prouct of odd index of array;
import java.util.*;
class Demo{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Size of arry=");
			int size= sc.nextInt();
			int arry[]=new int[size];
			System.out.println("Enter your number:");
			int mult=1;
				for(int i=0;i<arry.length;i++){
					arry[i]=sc.nextInt();
				}for(int i=0;i<arry.length;i++){
					if(i%2==1){
						mult=mult*arry[i];
					}
				}
				System.out.println("Product of odd number=" + mult);
	}
}
