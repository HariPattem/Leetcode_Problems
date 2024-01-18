import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Group_Anagrams_49 {
    
     public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
           String str1=sortString(str);
           if(map.containsKey(str1)){
            map.get(str1).add(str);
           }else{
            List<String> list=new LinkedList<>();
             list.add(str);
             map.put(str1,list);
           }
        }
        return new LinkedList<>(map.values());
    }
    
    public String sortString(String s){
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
