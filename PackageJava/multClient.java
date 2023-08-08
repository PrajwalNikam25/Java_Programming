
import java.util.*;
import arithfun.Multiplication;

class multClient{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		Multiplication obj = new Multiplication(x,y);

		System.out.println(obj.mult());
	}
}
