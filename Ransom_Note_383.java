public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
             return false;
        }
   int arr[]=new int[26];
      for(char c:magazine.toCharArray()){
          arr[c-'a']++;
      }
       for(char c:ransomNote.toCharArray()){
          if(arr[c-'a']==0){
            return false;
          }else{
              arr[c-'a']--;
          }
      }
   return true;
}
}
