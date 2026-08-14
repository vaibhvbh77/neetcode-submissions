class Solution {
    int[]dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
    public int solve(int []cost,int index){
        // base cases , if i reach out of array i.e cost.length<=index
        if(index>=cost.length)
        return 0;

        if(dp[index]!=-1)
        return dp[index];


        int firstCall=solve(cost,index+1);
        int secondCall=solve(cost,index+2);
  
        dp[index]= cost[index]+Math.min(firstCall,secondCall);
        return dp[index];

    }
}
