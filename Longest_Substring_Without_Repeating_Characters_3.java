import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_3 {
     public int lengthOfLongestSubstring(String s) {
       Set<Character> set=new HashSet<>();
       int i=0;
       int j=0;
       int max=0;
       while(j<s.length()){
         if(set.contains(s.charAt(j))){
             set.remove(s.charAt(i));
             i++;
         }else{
             set.add(s.charAt(j));
             j++;
             max=Math.max(set.size(),max);
         }
       }
       return max; 
    }
}
