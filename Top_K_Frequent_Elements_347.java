import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Elements_347 {
 public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
          if(map.containsKey(num)){
              int temp=map.get(num);
               map.put(num,++temp);
          }else{
              map.put(num,1);
          }
    }
   List<Integer> list[]=new List[nums.length+1];
   
         for(Map.Entry<Integer,Integer> m:map.entrySet()){
            int temp=m.getValue();
            if(list[temp]==null){
                list[temp]=new ArrayList<>();
            }
            list[temp].add(m.getKey());
             
         }

        int arr[]=new int[k];
        int count=0;
        for(int i=nums.length;i>=0 && count<k;i--){
            if(list[i]!=null){
                for(Integer num:list[i]){
                   arr[count++]=num;
                }
            }

        }
    return arr;
    }
    
}