// NullPointerException:


class Demo{

        void fun(){

                System.out.println("In fun");
        }
        void gun(){

                System.out.println("In Gun");
        }
}
class Client{

        public static void main(String[] args){

		System.out.println("Start Main:");
                Demo obj = new Demo();

                obj.fun();
		obj=null;
                try{
			obj.gun();
		}catch(NullPointerException ne){
		
		}
		System.out.println("End main:");
        }
}

