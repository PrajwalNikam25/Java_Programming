 // Access Specifer 
 // 1.Default 2.Private 3.Protective 4.Public
 

class Demo{

	int x=10;
	private int y =20;

	void fun(){
	
		System.out.println(x);
		System.out.println(y);
	}
}
class mainDemo{

	public static void main(String[] args){
	
		Demo obj = new Demo();

		obj.fun();

		System.out.println(obj.x);
//		System.out.println(obj.y);  // we cannot access this y in main demo class because it is Private
		
	}
}
//1.Default = we can access default variable in same class || Different class || Different file 
//{But not in Differnt folder}
//2.Privet = we can Access variable only in same class not in any other 
//3.Public = we can Access variable form any other like Different Folder
