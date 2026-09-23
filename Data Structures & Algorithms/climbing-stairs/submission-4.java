class Solution {
    int []dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n);
    }
    public int solve(int n){

        // base case
        if(n<=0){
            return 1;
        }

        int jump1=0;
        int jump2=0;

        if(dp[n]!=-1) return dp[n];

        if(n-1>=0)
         jump1=solve(n-1);
        if(n-2>=0)
         jump2=solve(n-2);

        dp[n]= jump1+jump2;
        return dp[n];
    }
}
