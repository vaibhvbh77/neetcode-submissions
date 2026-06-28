class Solution {
    public int rob(int[] nums) {
        int []dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int result=solve(nums,0,dp);
        return result;
    }
    public int solve(int []nums,int i,int []dp){
        if(i>=nums.length)return 0;

        if(dp[i]!=-1)
        return dp[i];

        int oneStep=solve(nums,i+2,dp)+nums[i];
        int secondStep=solve(nums,i+1,dp);


        dp[i]= Math.max(oneStep,secondStep);
        return dp[i];
            }
}
