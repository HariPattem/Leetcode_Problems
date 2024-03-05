import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_442 {
    
    public List<Integer> findDuplicates(int[] nums) {
      List<Integer> result=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        int ind=Math.abs(nums[i])-1;
        if(nums[ind]<0){
           result.add(ind+1);
        }else{
            nums[ind]*=-1;
        }
      }
      return result;
    }
}
