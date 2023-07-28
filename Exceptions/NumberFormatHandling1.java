//NumberFormatException Handling:

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

		int t=0;

                try{
			t = sc.nextInt();
		}catch(Exception ne){
		
			System.out.println("Please Enter valid Data");
		}

                System.out.println(obj.fun(t));
        }
}

