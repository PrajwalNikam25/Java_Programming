
import java.util.*;

class Demo{

	static int fun(int arr[],int n){
	
		TreeMap <Integer,Integer> tm = new TreeMap<Integer,Integer>();

		ArrayList <Integer> lm = new ArrayList <Integer>();

		for(int i=0 ;i<arr.length;i++){
		
			int s = tm.getOrDefault(arr[i],0);

			tm.put(arr[i],s+1);
		}
		for(Map.Entry<Integer,Integer> itr : tm.entrySet()){

			if(itr.getValue()%2==1){
			
				return itr.getKey();
			}
		}
		return -1;
		
	}

}
class Prajwal{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,2,3,1,3,3,3};

		int result=Demo.fun(arr,0);

		System.out.println(result);
	}
}
