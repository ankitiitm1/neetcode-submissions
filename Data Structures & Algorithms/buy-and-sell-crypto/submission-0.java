class Solution {
    public int maxProfit(int[] prices) {

        int minsofar=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(prices[i],minsofar);
            maxProfit=Math.max(maxProfit,prices[i]-minsofar);       
        }

        return maxProfit;
        
    }
}
