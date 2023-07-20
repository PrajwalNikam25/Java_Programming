class Demo{
	public static void main(String[] a){
		int x=0;
		int y=0;
		Integer z=0;
		Integer i= new Integer(a);//It does not shows same address:
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(i));
	}
}
