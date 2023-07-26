//Calling Method:
import java.util.*;
class Demo{
		static void add(int A,int B){
			int sum = A + B;
			System.out.println("sum="+ sum);
		}
		static void sub(int A,int B){
			int sub = A - B;
			System.out.println("Sub="+ sub);
		}
		static void mult(int A,int B){
			int mult = A * B;
			System.out.println("mult="+ mult);
		}
		static void div(int A,int B){
			int div = A / B;
			System.out.println("div="+ div);
		}
		public static void main(String[] a){
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter your numbers:");
			int  x = sc.nextInt();
			 int y = sc.nextInt();

			add(x,y);
			sub(x,y);
			mult(x,y);
			div(x,y);
		}

	}
