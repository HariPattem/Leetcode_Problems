public class First_Unique_Character_in_a_String_387 {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
         for(char str:s.toCharArray()){
             arr[str-'a']++;
         }       
        for(int i=0;i<s.length();i++){
          if(arr[s.charAt(i)-'a']==1){
              return i;
          }
        }
         return -1;
       }
}
