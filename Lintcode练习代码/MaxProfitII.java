package killLint;

public class MaxProfitII {
	public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length == 0){
            return 0;
        }
        int p = 1;
        int sum = 0;
        while(p< prices.length){
            if(prices[p] > prices[p-1]){
                sum += prices[p] - prices[p-1];
            }
            p++;
        }
        return sum;
    }
}
