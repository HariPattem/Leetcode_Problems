import java.util.HashMap;

public class Two_Sum_1 {
    public int[] sum(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr1[]=new int[2];
        for(int i=0;i<arr.length;i++){
            int sum=target-arr[i];
            if(map.containsKey(sum)){
                arr1[0]=map.get(sum);
                arr1[1]=i;
               
                return arr1;
            }else{
                map.put(arr[i],i);
            }
        }
        return arr1;
    } 
}
