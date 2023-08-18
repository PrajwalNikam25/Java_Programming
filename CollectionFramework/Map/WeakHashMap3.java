//WeakHashMap:

import java.util.*;

class Demo{

        String str;

        Demo(String str){

                this.str = str;
        }
        public String toString(){

                return str;
        }
        public void finalize(){

                System.out.println("Notify");
        }
}
class Client{

        public static void main(String[] a){

                Demo obj1 = new Demo("Prajwal");
                Demo obj2 = new Demo("Om");
                Demo obj3 = new Demo("Vishal");

                System.out.println(obj1);
                System.out.println(obj2);
                System.out.println(obj3);

                WeakHashMap hs = new WeakHashMap();

                hs.put(obj1,"Nikam");
                hs.put(obj2,"Pawar");
                hs.put(obj3,"Mahajan");

                obj1=null;

                System.gc();

                System.out.println(hs);
        }
}

