class Solution {
    public int climbStairs(int n) {
    int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=solve(n,dp);
        return res;

    }
    public int solve(int n,int []dp){

        if(n==1||n==0){
            dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else {
            dp[n]= solve(n-2,dp)+solve(n-1,dp);
        }
        return dp[n];


    }
}
