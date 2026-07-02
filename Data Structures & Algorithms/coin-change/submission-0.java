class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
         dp=new int[coins.length+1][amount+1];
         for(int i=0;i<=coins.length;i++)
         Arrays.fill(dp[i],-1);

         int ans=solve(coins,amount,coins.length);
         if(ans==Integer.MAX_VALUE){
            return -1;
         }
         else return ans;
    }
    public int solve(int []coins,int amount,int index){
        if(amount==0){
            return 0;
        }
        if(index==0){
            return Integer.MAX_VALUE;
        }
        if(dp[index][amount]!=-1)return dp[index][amount];
        if(amount>=coins[index-1])
        {
        int call1=solve(coins,amount-coins[index-1],index);
        if(call1!=Integer.MAX_VALUE){
            call1++;
        }
        int call2=solve(coins,amount,index-1);
        dp[index][amount]= Math.min(call1,call2);
        return dp[index][amount];
        }
        int call2=solve(coins,amount,index-1);
        dp[index][amount]= call2;
        return dp[index][amount];
    }
}
