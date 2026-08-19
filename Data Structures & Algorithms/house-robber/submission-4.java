class Solution {
    int []dp;
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int result=solve(nums,0);
        return result;
    }
    public int solve(int []nums,int i){
        if(i>=nums.length)return 0;

        if(dp[i]!=-1)
        return dp[i];

        // int oneStep=solve(nums,i+2,dp)+nums[i];
        // int secondStep=solve(nums,i+1,dp);


        // dp[i]= Math.max(oneStep,secondStep);
        // return dp[i];

        int stole=solve(nums,i+2)+nums[i];
        int notStole=solve(nums,i+1);

        dp[i]= Math.max(stole,notStole);

        return dp[i];


        }


}
