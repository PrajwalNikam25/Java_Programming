//NumberFormatException:

import java.util.*;
class Demo{

	int fun(int t){
		
		return t;
	}
}
class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		Demo obj = new Demo();

		int t = sc.nextInt();

		System.out.println(obj.fun(t));
	}
}
