//Print ovals in arry;
import java.util.*;

class Demo{
	public static void main(String[] a){
	Scanner sc = new Scanner(System.in);
	System.out .println("Enetr size of Arry:");
	int size= sc.nextInt();

	char arr[] = new char[size];
	for(int i = 0; i < arr.length; i++){
		
		arr[i] = sc.next().charAt(0);

	}System.out.println("Enter the ovals in Arry:");
	for(int i=0;i<arr.length;i++){
	
		if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
			System.out.println(arr[i]);
		}
	}

	
	}
}
