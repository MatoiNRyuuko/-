package killLeet;

public class MaxProfit {
	public int maxProfit(int[] prices) {
        int profit = 0,p1 = 0,p2 = 1;
        while(p1<prices.length-1){
            if(prices[p1] < prices[p2]){
                profit += prices[p2] - prices[p1];
            }
            p1++;
            p2++;
        }
        return profit;
    }
}
