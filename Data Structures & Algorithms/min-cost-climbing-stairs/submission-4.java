class Solution {
    int[]dp;
    public int minCostClimbingStairs(int[] cost) {
         dp=new int[cost.length+1];
        Arrays.fill(dp,-1);

        return Math.min(solve(0,cost),solve(1,cost));
    }
    public int solve(int index,int []cost){
        if(index>=cost.length) return 0;

        if(dp[index]!=-1) return dp[index];

        int step1=solve(index+1,cost);
        int step2=solve(index+2,cost);

        dp[index]= cost[index]+Math.min(step1,step2);
        return dp[index];
    }
}
