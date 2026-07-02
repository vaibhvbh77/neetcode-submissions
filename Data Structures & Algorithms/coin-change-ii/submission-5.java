class Solution {
    int [][]dp;
    public int change(int amount, int[] coins) {
        dp=new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            Arrays.fill(dp[i],-1);
        }

         solve(amount,coins,coins.length);
         return dp[coins.length][amount];
    }
    public int solve(int amount,int []coin,int index){
        if(amount==0){dp[index][amount]= 1;return dp[index][amount];}

        if(index==0)
        {dp[index][amount]= 0;return dp[index][amount];}

        if(dp[index][amount]!=-1)return dp[index][amount];
        if(coin[index-1]<=amount){
            int take=solve(amount-coin[index-1],coin,index);
            int skip=solve(amount,coin,index-1);
            dp[index][amount]=take+skip;
            return dp[index][amount];
        }
        dp[index][amount]=solve(amount,coin,index-1);
        return dp[index][amount];
    }
}
