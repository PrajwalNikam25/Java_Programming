// Arithmetic Exception:

import java.util.*;
class Demo {

	int fun(int x){

		return 10/x;
	}
}
class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		Demo obj = new Demo();

		int x = sc.nextInt();   // When User give the 0 input then it throw thr Arithmetic Exception:

		System.out.println(obj.fun(x));


	}
}
