// OverLoading Demo:


class Demo{

        void fun(float y,int x){

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
                obj.fun(10,20f); // Instead of this we pass like( ibj.fun(10,20)) It gives an error ambigous 
        }
}


