/**
 * Running_Sum_of_1d_Array_1480
 */
public class Running_Sum_of_1d_Array_1480 {
    
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
       return nums;
    }
}