//passing parameters:
class Demo{
	
	void fun(int x,double y){
		System.out.println(x);
		System.out.println(y);

	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun('A',20);
	}
}
