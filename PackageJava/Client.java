
import java.util.*;
import arithfun.Addition;

class Client{

	public static void main(String[] a){
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		Addition obj = new Addition(x,y);

		System.out.println(obj.add());
	}
}
