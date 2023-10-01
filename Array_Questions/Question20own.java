  
import java.util.*;


class Demo{

	void fun(int arr[]){
	
		int count=0;

		int sum=0;

		Set s = new HashSet();

		for(int i=0;i<arr.length;i++){
			
			count =0;

			for(int j=0;j<arr.length;j++){
			
				if(arr[i]==arr[j]){
				
					count++;
				}
			}
			if(count==2){
			
				s.add(arr[i]);
			}
		}
		Iterator<Integer> itr = s.iterator();

		while(itr.hasNext()){
		
			int x = itr.next();

			sum = sum + x;
		}

		System.out.println(sum);
	}
}
class Client{

	public static void main(String[] s){
	
		int arr[] = new int[]{0,1,2,-3,1,2};

		Demo obj = new Demo();

		obj.fun(arr);
	}
}
