package Best_Time_To_Buy_And_Sell_Stock_121;

public class Solution2 {

  public int maxProfit(int[] prices) {
  int max=0;

  for(int i=0;i< prices.length-1;i++){
    for(int j=i+1;j<prices.length;j++){
      int profit=prices[j]-prices[i];
      if(profit>max){
        max=profit;
      }
    }
  }
  return max;
  }

}
