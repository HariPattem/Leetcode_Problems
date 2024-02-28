public class Length_of_Last_Word_58 {
    public int lengthOfLastWord(String s) {
        int count=0;
       s=s.trim();
       for(int i=s.length()-1;i>=0;i--){
          if(!Character.isLetter(s.charAt(i))){
              return count;
          }
          count++;
       }
       return count;
    }
}
