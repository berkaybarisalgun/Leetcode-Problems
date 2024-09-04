package Best_Time_To_Buy_And_Sell_Stock_121;

public class OptimalSolution {

  public int maxProfit(int[] prices) {
    int buyPrice=99999999;
    int profit=0;
    for(int i=0;i<prices.length;i++){
      if(prices[i]<buyPrice){
        buyPrice=prices[i];
      }
      if(prices[i]-buyPrice>profit){
        profit=prices[i]-buyPrice;
      }
    }
    if(profit>0){
      return profit;
    }
    else{
      return 0;
    }
  }

}
