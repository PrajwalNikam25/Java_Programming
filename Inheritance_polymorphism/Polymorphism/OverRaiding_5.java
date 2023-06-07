class Parent{

        Parent(){

                System.out.println("In Parebnt Constructor:");
        }
        void fun(int x){

                System.out.println("In Parent method");
                System.out.println(x);
        }
}
class Child extends Parent{

        Child(){

                System.out.println("In Child Constructor");
        }
        void fun(int y){

                System.out.println("In Child Method");
                System.out.println(y);
        }
}
class Client{

        public static void main(String[] a){
              //Reference  = Object    
                Parent obj = new Child();
                obj.fun(20);     // But instead of this pass obj.fun() It gives an error:
        }
}

