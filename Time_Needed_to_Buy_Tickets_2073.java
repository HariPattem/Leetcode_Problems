public class Time_Needed_to_Buy_Tickets_2073 {
   
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res=0;
       for(int i=0;i<tickets.length;i++){
          if(i<=k){
           res+=Math.min(tickets[i],tickets[k]);
          }else{
             res+=Math.min(tickets[i],tickets[k]-1);
          }
       }
        return res;
    }
}
