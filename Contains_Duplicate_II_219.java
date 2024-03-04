import java.util.HashMap;

public class Contains_Duplicate_II_219 {
     public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(hash.containsKey(nums[i])){
               int temp=hash.get(nums[i]);
              if((i-temp)<=k){
                    return true;
              }
              hash.put(nums[i],i);
           }else{
               hash.put(nums[i],i);
           }
        }
        return false;
    }
}
