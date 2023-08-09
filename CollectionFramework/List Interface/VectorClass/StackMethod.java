//Stack Method  Demo:

import java.util.*;
class Client{

        public static void main(String[] a){

                Stack s = new Stack();

                s.push(10);
                s.push(20);
                s.push(30);
                s.push(40);

                //s.pop();

		//System.out.println(s.peek());
		
		//System.out.println(s.empty());
		
		System.out.println(s.search(10));
	
        }
}

