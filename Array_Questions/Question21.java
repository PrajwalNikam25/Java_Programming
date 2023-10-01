 
import java.util.*;

class Demo{

	static void fun(int arr[],int n){
	
		TreeMap<Integer,Integer> hm = new TreeMap<Integer,Integer>();

		ArrayList al = new ArrayList();

		for(int i=0;i<arr.length;i++){
		
			int s = hm.getOrDefault(arr[i],0);

			hm.put(arr[i],s+1);

			for(Map.Entry<Integer,Integer> itr : hm.entrySet()){
			
				if(itr.getValue()==2){

					al.add(itr.getKey());
				}
			}

		}
		System.out.println(al);

	}

}
class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,7,4,3,4,8,7};

		Demo.fun(arr,0);
	}
}
