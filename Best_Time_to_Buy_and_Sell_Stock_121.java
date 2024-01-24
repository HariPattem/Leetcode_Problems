public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
       for(int i=0;i<prices.length;i++){
             min=Math.min(min,prices[i]);
             max=Math.max(max,prices[i]-min);
       } 
       return max;
    }
}
