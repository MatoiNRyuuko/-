package killLint;

public class MaxProfit {
	public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length == 0 ){
            return 0;
        }
        int min = prices[0],profits = 0,p = 0;
        while(p != prices.length){
            if(prices[p] < min){
                min = prices[p];
            }else{
                if(prices[p] - min > profits){
                    profits = prices[p] - min;
                }
            }
            p++;
        }
        return profits;
        
    }
}
