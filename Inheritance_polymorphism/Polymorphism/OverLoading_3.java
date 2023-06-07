// OverLoading Demo:


class Demo{

        void fun(int x){

                System.out.println("In Method 1");
                System.out.println(x);
        }
        void fun(int x,float y){       

                System.out.println("In method 2");
                System.out.println(x);
                System.out.println(y);
        }
}
class client{

        public static void main(String[] ae){

                Demo obj = new Demo();
                obj.fun(10,20); // we Pass the int value for method 2 but there is no any lossy conversion of int to float therefore it not gives error
        }
}
   
