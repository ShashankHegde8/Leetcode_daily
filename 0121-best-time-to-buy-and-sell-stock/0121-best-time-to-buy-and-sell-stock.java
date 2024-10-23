class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0;
        if(prices.length==1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i]<mini){
                mini=prices[i];
            }
            profit=Math.max(profit,prices[i]-mini);
        }
        return profit;

    }
}