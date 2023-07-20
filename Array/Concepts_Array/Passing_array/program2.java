class Demo{
	
	static void fun (int x, int y){
	
	
		System.out.println(x);
		System.out.println(y);
		x=x+20;
		y=y+20;
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] a){

		int x=10;
		int y=22;

		System.out.println(x);
		System.out.println(y);

		fun(x,y);
		System.out.println(x);
		System.out.println(y);
	

	}	

	}

