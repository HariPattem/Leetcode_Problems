public class Divide_a_String_Into_Groups_of_Size_k_2138 {
    public String[] divideString(String s, int k, char fill) {
        int divideSize = s.length() / k;
         int fillSize = s.length() % k;
         int arrSize = fillSize == 0 ? divideSize : divideSize + 1;
         
         String[] result = new String[arrSize];
         for (int i = 0; i < arrSize; i++) {
             if (i == arrSize - 1 && fillSize > 0) {
                 StringBuilder sb = new StringBuilder();
                 sb.append(s.substring(i * k, s.length()));
                 for (int j = 0; j < k - fillSize; j++) {
                     sb.append(fill);
                 }
                 result[i] = sb.toString();
             } else {
                 result[i] = s.substring(i * k, (i + 1) * k);
             }
            
         }
 
         return result;
     }
}
