class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int localProfit=prices[i]-min;
            ans=Math.max(localProfit,ans);
            min=Math.min(prices[i],min);
        }
        return ans;

    }
}
