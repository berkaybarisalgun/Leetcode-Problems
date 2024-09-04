package Best_Time_To_Buy_And_Sell_Stock_121;

public class Solution {
    public int maxProfit(int[] prices) {
        int high=-1;
        int profit=0;

        for(int i=0;i<prices.length-1;i++){
            high=0;
        int current=prices[i];
        for(int j=i+1;j<prices.length;j++){
            if(prices[j]>high){
                high=prices[j];
            }
        }
        if(high-current>profit){
            profit=high-current;
        }
        }
        return profit;
    }
}
