import java.util.Arrays;

public class Longest_Common_Prefix_14 {
     public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
           return "";
        }
        if(strs.length==1){
           return strs[0];
        }
        Arrays.sort(strs);
        StringBuilder str=new StringBuilder();
        char first[]=strs[0].toCharArray();
        char second[]=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length && i<second.length;i++){
           if(first[i]!=second[i]){
               break;
           }
           str.append(first[i]);
        }
        return str.toString();  
    }
}
