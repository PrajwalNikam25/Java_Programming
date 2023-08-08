// Itreator:

import java.util.*;

class Client{

        public static void main(String[] a){

                ArrayList al = new ArrayList();

                al.add(10);
                al.add(20.5f);
                al.add(30.5);
                al.add("Prajwal");

                Iterator itr = al.iterator();

                while(itr.hasNext()){

                        if("Prajwal".equals(itr.next())){
			
				itr.remove();
			}
                }
		System.out.println(al);
        }
}

