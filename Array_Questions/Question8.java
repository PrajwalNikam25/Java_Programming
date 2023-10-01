import java.util.*;

class Demo{

	static int[] repeatingEven(int[] arr, int n){
	
	TreeMap<Integer,Integer> hm = new TreeMap<>();
        
        for(int i =0;i<arr.length;i++){
            
            int s = hm.getOrDefault(arr[i],0);
            
            hm.put(arr[i],s+1);
        }
        

       
       ArrayList<Integer> al = new ArrayList<>();
       
       
       for(Map.Entry<Integer,Integer> itr : hm.entrySet()){
           
           if(itr.getValue()%2==0){
               
               al.add(itr.getKey());
           }
       }
       
       if(al.size()==0){
           
           return new int[]{-1};
       }
       int arr2[] = new int[al.size()];
       
       for(int i = 0;i<al.size();i++){
           
           arr2[i] = al.get(i); 
       }
       
       return arr2;
		

	}
	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,1,2,1,4,5};
		
		int arr1[] = repeatingEven(arr,0);
		
		for(int i=0;i<arr1.length;i++){
		
			System.out.println(arr1[i]);
		}
	}
}
