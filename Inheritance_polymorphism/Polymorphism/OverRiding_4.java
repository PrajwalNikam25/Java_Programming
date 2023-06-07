// OverRaiding Demo



class Parent{

        Parent(){

                System.out.println("In Parebnt Constructor:");
        }
        void fun(int x){

                System.out.println("In Parent method");
        }
}
class Child extends Parent{

        Child(){

                System.out.println("In Child Constructor");
        }
        void fun(){         

                System.out.println("In Child Method");
        }
}
class Client{

        public static void main(String[] a){
              //Reference  = Object    
                Parent obj = new Child();
                obj.fun(10);     // But instead of this pass obj.fun() It gives an error:
        }
}

