import java.util.ArrayList;
import java.util.List;

public class Partition_Labels_763 {
     public List<Integer> partitionLabels(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
              arr[s.charAt(i)-'a']=i;
        }
        List<Integer> result=new ArrayList<>();
        int end=0;
        int start=0;
        for(int i=0;i<s.length();i++){
          end=Math.max(end,arr[s.charAt(i)]);
          if(i==end){
             result.add(end-start+1);
             start=end+1;
          }   
        }

    return result;
   }
}
